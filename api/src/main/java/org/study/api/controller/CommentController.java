package org.study.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.api.service.CommentService;
import org.study.api.service.PostService;
import org.study.domain.Comment;
import org.study.domain.Member;
import org.study.domain.Post;
import org.study.domain.common.CommonResponse;
import org.study.domain.common.ResultCode;
import org.study.dto.request.CommentRequest;
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
        return new CommonResponse(ResultCode.SUCCESS);
    }

    @PostMapping("update")
    public CommonResponse update() {
        Comment update = commentService.update();
        return new CommonResponse(ResultCode.SUCCESS);
    }

    @PostMapping("delete")
    public CommonResponse delete() {
        commentService.delete();
        return new CommonResponse(ResultCode.SUCCESS);
    }
}
