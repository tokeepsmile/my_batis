package com.wangwei.enums;

/**
 * @Author wangwei
 * @Date 2021/5/31 4:41 上午
 * @Version 1.0
 */
public enum ExceptionMsg {
    SUCCESS("200", "成功"),
    FAILED("9999", "失败")
    ;

    ExceptionMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private final String code;
    private final String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
