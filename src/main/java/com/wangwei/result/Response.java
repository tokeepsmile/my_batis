package com.wangwei.result;

import com.wangwei.enums.ExceptionMsg;

/**
 * @Author wangwei
 * @Date 2021/5/31 4:35 上午
 * @Version 1.0
 */
public class Response {
    private String resCode;
    private String resMsg;

    public Response(String resCode, String resMsg) {
        this.resCode = resCode;
        this.resMsg = resMsg;
    }

    public Response(ExceptionMsg exceptionMsg) {
        this.resCode = exceptionMsg.getCode();
        this.resMsg = exceptionMsg.getMsg();
    }

    public Response(String resMsg) {
        this.resMsg = resMsg;
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }
}
