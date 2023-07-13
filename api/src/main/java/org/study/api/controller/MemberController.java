package org.study.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.api.service.MemberService;
import org.study.domain.common.CommonResponse;
import org.study.domain.common.ResultCode;
import org.study.dto.MemberJoinRequest;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("join")
    public CommonResponse join(MemberJoinRequest request) {
        memberService.join(request);
        return new CommonResponse(ResultCode.SUCCESS);
    }
}
