package org.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.study.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
