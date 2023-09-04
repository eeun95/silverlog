package org.study.dto.request;

import lombok.Data;
import org.study.entity.Member;

@Data
public class MemberJoinRequest {
    private String name;

    private String memberId;

    private String password;

    public Member toEntity() {
        return Member.builder()
                .name(name)
                .memberId(memberId)
                .password(password)
                .build();
    }
}
