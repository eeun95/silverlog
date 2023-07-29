package org.study.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.domain.common.CommonResponse;
import org.study.domain.common.ResultCode;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comment")
public class CommentController {

    @PostMapping("regist")
    public CommonResponse regist() {
        return new CommonResponse(ResultCode.SUCCESS);
    }

    @PostMapping("update")
    public CommonResponse update() {
        return new CommonResponse(ResultCode.SUCCESS);
    }

    @PostMapping("delete")
    public CommonResponse delete() {
        return new CommonResponse(ResultCode.SUCCESS);
    }
}
