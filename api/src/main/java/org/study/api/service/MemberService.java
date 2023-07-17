package org.study.api.service;

import org.study.domain.Member;
import org.study.dto.request.MemberJoinRequest;

public interface MemberService {
    Member join(Member member);
}
