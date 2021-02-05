package com.example.springbootjemeterdemo.exception;

import lombok.Getter;

/**
 * 自定义异常处理.
 *
 * @author Lenovo
 */
@Getter
public class DefinitionException extends RuntimeException {
    /**
     * 是否成功.
     */
    private final boolean success;
    /**
     * 状态码。
     */
    private final int code;
    /**
     * 提示信息.
     */
    private final String msg;

    /**
     * 定义构造函数.
     *
     * @param success true or false.
     * @param code    操作的结果编码.
     * @param msg     操作结果的提示信息主要是异常信息.
     */
    public DefinitionException(boolean success, int code, String msg) {
        super(msg);
        this.success = success;
        this.code = code;
        this.msg = msg;
    }
}
