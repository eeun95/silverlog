package org.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.study.domain.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByMemberId(String memberId);
}
