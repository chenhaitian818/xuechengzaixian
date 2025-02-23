package com.xuecheng.base.exception;

import java.io.Serializable;

/**
 * @Author chenhaitian
 * @Packge com.xuecheng.base.exception
 * @Date 2025/2/23 13:13
 * @description 错误响应参数包装
 */
public class RestErrorResponse implements Serializable {

    private String errMessage;

    public RestErrorResponse(String errMessage){
        this.errMessage= errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}
