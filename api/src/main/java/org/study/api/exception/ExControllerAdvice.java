package org.study.api.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.study.domain.common.CommonResponse;
import org.study.domain.common.ErrorCode;

@RestControllerAdvice
public class ExControllerAdvice {

    @ExceptionHandler(MemberNotFound.class)
    public CommonResponse MemberNotFoundException(MemberNotFound e) {
        return new CommonResponse(ErrorCode.MEMBER_NOT_FOUND);
    }

}
