package org.study.domain.common;

import lombok.Getter;

@Getter
public class CommonResponse<T> {
    private Code code;

    private String msg;

    private T data;

    public CommonResponse(Code code) {
        this.code = code;
        this.msg = getCodeMsg(code);
    }
    public CommonResponse(Code code, T data) {
        this.code = code;
        this.msg = getCodeMsg(code);
        this.data = data;
    }

    public String getCodeMsg(Code code) {
        if(code instanceof ResultCode) {
            return ((ResultCode) code).getMessage();
        } else if(code instanceof ErrorCode){
            return ((ErrorCode) code).getMessage();
        } else {
            return "정의되지 않은 코드 메시지입니다.";
        }
    }
}
