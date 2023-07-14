package org.study.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.study.api.exception.MemberDuplicatedException;
import org.study.domain.Member;
import org.study.dto.request.MemberJoinRequest;
import org.study.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Member join(MemberJoinRequest request) {
        Member member = memberRepository.findByMemberId(request.getMemberId()).orElseThrow(() -> new MemberDuplicatedException());
        return member;
    }
}
