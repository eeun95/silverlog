package org.study.dto.response;

import lombok.Data;
import org.study.entity.Member;

@Data
public class MemberJoinResponse {
    private Long id;

    private String name;

    private String memberId;

    public MemberJoinResponse(Member member) {
        this.id = member.getId();
        this.name = member.getName();
        this.memberId = member.getMemberId();
    }
}
