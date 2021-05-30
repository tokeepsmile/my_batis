package com.wangwei.result;

import com.wangwei.enums.ExceptionMsg;

/**
 * @Author wangwei
 * @Date 2021/5/31 4:38 上午
 * @Version 1.0
 */
public class ResponseData extends Response{
    private Object data;

    public ResponseData(ExceptionMsg resMsg, Object data) {
        super(resMsg);
        this.data = data;
    }

}
