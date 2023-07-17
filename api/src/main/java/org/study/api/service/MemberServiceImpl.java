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
    public Member join(Member member) {
        Member findMember = memberRepository.findByMemberId(member.getMemberId()).orElseThrow(() -> new MemberDuplicatedException());
        Member saveMember = memberRepository.save(member);
        return saveMember;
    }
}
