package org.study.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.study.api.service.MemberService;
import org.study.entity.Member;
import org.study.entity.common.CommonResponse;
import org.study.entity.common.ResultCode;
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

    @GetMapping("{id}")
    public CommonResponse find(@PathVariable("id") Long id) {
        Member member = memberService.find(id);
        return new CommonResponse(ResultCode.SUCCESS);
    }
}
