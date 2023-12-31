package org.study.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.study.api.service.CommentService;
import org.study.api.service.PostService;
import org.study.entity.Comment;
import org.study.entity.Member;
import org.study.entity.Post;
import org.study.entity.common.CommonResponse;
import org.study.entity.common.ResultCode;
import org.study.dto.request.CommentRequest;
import org.study.dto.request.CommentUpdateRequest;
import org.study.dto.response.CommentResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comment")
public class CommentController {

    private final PostService postService;
    private final CommentService commentService;

    @PostMapping("regist")
    public CommonResponse regist(CommentRequest request) {
        Post post = postService.findOne(request.getPostId());
        Member member = post.getMember();
        Comment comment = Comment.builder()
                .post(post)
                .comment(request.getComment())
                .member(member)
                .build();
        Comment regist = commentService.regist(comment);
        CommentResponse response = CommentResponse.toResponse(regist);
        return new CommonResponse(ResultCode.SUCCESS, response);
    }

    @PostMapping("update")
    public CommonResponse update(CommentUpdateRequest request) {
        Comment comment = request.toEntity();
        Comment update = commentService.update(comment);
        CommentResponse response = CommentResponse.toResponse(update);
        return new CommonResponse(ResultCode.SUCCESS, response);
    }

    @DeleteMapping("{commentId}")
    public CommonResponse delete(@PathVariable("commentId") Long commentId) {
        commentService.delete(commentId);
        return new CommonResponse(ResultCode.SUCCESS);
    }
}
