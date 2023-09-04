package org.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.study.entity.Member;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByMemberIdAndDeletedAtIsNull(String memberId);

    Optional<Member> findByIdAndDeletedAtIsNull(Long id);
}
