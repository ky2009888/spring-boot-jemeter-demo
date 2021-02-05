package com.example.springbootjemeterdemo.result;

import com.example.springbootjemeterdemo.exception.DefinitionException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 封装返回结果.
 *
 * @param <T> 返回的数据类型.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Result<T extends Serializable> implements Serializable {
    /**
     * 是否成功.
     */
    private boolean success;
    /**
     * 状态码。
     */
    private int code;
    /**
     * 提示信息.
     */
    private String msg;
    /**
     * 满足要求的所有记录数。
     */
    private long totalCount;
    /**
     * 当前返回的记录数。
     */
    private long currentCount;
    /**
     * 数据。
     */
    private T data;

    /**
     * 定义有参构造方法
     *
     * @param success 是否成功,true or false
     * @param code    接口响应编码.
     * @param msg     接口响应信息.
     * @param data    接口返回数据.
     */
    public Result(boolean success, int code, String msg, T data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 自定义异常信息.
     *
     * @param e 自定义异常.
     * @return result
     */
    public static Result<String> defineError(DefinitionException e) {
        Result<String> result = new Result<>();
        result.setSuccess(e.isSuccess());
        result.setCode(e.getCode());
        result.setMsg(e.getMsg());
        result.setData(null);
        return result;
    }

    /**
     * 其他异常处理方法返回的结果
     *
     * @param errorEnum 枚举类型错误消息的入参.
     * @return result 对象返回体.
     */
    public static Result<String> otherError(MessageEnum errorEnum) {
        Result<String> result = new Result<>();
        result.setMsg(errorEnum.getResultMsg());
        result.setCode(errorEnum.getResultCode());
        result.setSuccess(false);
        result.setData(null);
        return result;
    }
}
