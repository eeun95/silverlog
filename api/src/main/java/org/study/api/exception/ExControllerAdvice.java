package org.study.api.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.study.entity.common.CommonResponse;
import org.study.entity.common.ErrorCode;

@RestControllerAdvice
public class ExControllerAdvice {

    @ExceptionHandler(MemberNotFoundException.class)
    public CommonResponse MemberNotFoundException(MemberNotFoundException e) {
        return new CommonResponse(ErrorCode.MEMBER_NOT_FOUND);
    }

    @ExceptionHandler(PostNotFoundException.class)
    public CommonResponse PostNotFoundException(PostNotFoundException e) {
        return new CommonResponse(ErrorCode.POST_NOT_FOUND);
    }
    @ExceptionHandler(CommentNotFoundException.class)
    public CommonResponse CommentNotFoundException(CommentNotFoundException e) {
        return new CommonResponse(ErrorCode.COMMENT_NOT_FOUND);
    }

}
