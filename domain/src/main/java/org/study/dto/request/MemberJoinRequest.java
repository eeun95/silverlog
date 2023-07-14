package org.study.dto.request;

import lombok.Data;

@Data
public class MemberJoinRequest {
    private String name;

    private String memberId;

    private String password;

}
