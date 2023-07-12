package org.study.domain.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode implements Code {

    SUCCESS(200, "정상적으로 처리되었습니다.");

    private int code;
    private String message;


}
