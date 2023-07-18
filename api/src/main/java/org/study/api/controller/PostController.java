package org.study.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.api.service.PostService;
import org.study.domain.Post;
import org.study.domain.common.CommonResponse;
import org.study.domain.common.ResultCode;
import org.study.dto.request.PostWriteRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {

    private final PostService postService;

    @PostMapping("write")
    public CommonResponse write(PostWriteRequest request) {
        Post post = request.toEntity();
        postService.write(post);
        return new CommonResponse(ResultCode.SUCCESS);
    }

    @PostMapping("update")
    public CommonResponse update() {
        return new CommonResponse(ResultCode.SUCCESS);
    }

    @DeleteMapping("{id}")
    public CommonResponse delete() {

        return new CommonResponse(ResultCode.SUCCESS);
    }
}
