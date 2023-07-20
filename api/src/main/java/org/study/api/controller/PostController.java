package org.study.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.study.api.service.PostService;
import org.study.domain.Post;
import org.study.domain.common.CommonResponse;
import org.study.domain.common.ResultCode;
import org.study.dto.request.PostWriteRequest;
import org.study.dto.response.PostResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {

    private final PostService postService;

    @PostMapping("write")
    public CommonResponse write(PostWriteRequest request) {
        Post post = request.toEntity();
        Post savePost = postService.write(post);
        PostResponse response = PostResponse.toResponse(savePost);
        return new CommonResponse(ResultCode.SUCCESS, response);
    }

    @PostMapping("update")
    public CommonResponse update(PostWriteRequest request) {
        Post post = request.toEntity();
        Post updatePost = postService.update(post);
        PostResponse response = PostResponse.toResponse(updatePost);
        return new CommonResponse(ResultCode.SUCCESS, response);
    }

    @DeleteMapping("{id}")
    public CommonResponse delete(@PathVariable("id") Long id) {
        postService.delete(id);
        return new CommonResponse(ResultCode.SUCCESS);
    }
}
