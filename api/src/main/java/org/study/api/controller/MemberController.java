package org.study.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.api.service.MemberService;
import org.study.domain.Member;
import org.study.domain.common.CommonResponse;
import org.study.domain.common.ResultCode;
import org.study.dto.request.MemberJoinRequest;
import org.study.dto.response.MemberJoinResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("join")
    public CommonResponse join(MemberJoinRequest request) {
        Member member = memberService.join(request.toEntity());
        MemberJoinResponse response = new MemberJoinResponse(member);
        return new CommonResponse(ResultCode.SUCCESS, response);
    }
}
