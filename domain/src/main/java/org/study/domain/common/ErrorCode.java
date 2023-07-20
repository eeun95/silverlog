package org.study.domain.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode implements Code {

    MEMBER_NOT_FOUND(404, "존재하는 회원이 없습니다."),
    WRONG_PARAMETER(400, "잘못된 요청 파라미터입니다."),
    POST_NOT_FOUND(404, "존재하지 않는 게시글입니다.");

    private int code;
    private String message;
}
