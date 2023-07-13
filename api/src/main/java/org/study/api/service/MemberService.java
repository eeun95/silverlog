package org.study.api.service;

import org.study.domain.Member;
import org.study.dto.MemberJoinRequest;

public interface MemberService {
    Member join(MemberJoinRequest request);
}
