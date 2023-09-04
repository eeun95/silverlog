package org.study.api.service;

import org.study.entity.Member;

public interface MemberService {
    Member join(Member member);

    Member find(Long id);
}
