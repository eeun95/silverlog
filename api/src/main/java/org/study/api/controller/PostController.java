package org.study.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.api.service.PostService;
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
        return new CommonResponse(ResultCode.SUCCESS);
    }
}
