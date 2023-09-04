package org.study.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.study.api.exception.MemberDuplicatedException;
import org.study.api.exception.MemberNotFoundException;
import org.study.entity.Member;
import org.study.repository.MemberRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Member join(Member member) {
        memberRepository.findByMemberIdAndDeletedAtIsNull(member.getMemberId()).orElseThrow(() -> new MemberDuplicatedException());
        Member saveMember = memberRepository.save(member);
        return saveMember;
    }

    @Override
    public Member find(Long id) {
        Member findMember = memberRepository.findByIdAndDeletedAtIsNull(id).orElseThrow(() -> new MemberNotFoundException());
        return findMember;
    }
}
