package com.example.springbootjemeterdemo.result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 常见的错误提示语定义.
 *
 * @author Lenovo
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum MessageEnum {
    /**
     * 枚举数据操作定义.
     */
    SUCCESS(0, "成功"),
    NO_PERMISSION(1, "您当前没有开通权限，请联系系统运维人员"),
    QUERY_FAILURE(3, "查询失败"),
    CHECK_PARAMETER_FAILURE(2, "参数校验失败:当前参数为空，请检查后再重试"),
    CHECK_PARAMETER_INDEX_FAILURE(5, "参数校验失败:当前索引名称参数值为空，请填写后再来重试"),
    PARSE_PARAMETER_FAILURE(4, "JSON格式的参数解析IO失败"),
    REDIS_CONNECTION_FAILURE(6, "当前Redis服务器无法连接，请稍后重试"),
    NOT_FOUND(404, "您当前访问的资源或服务不存在!"),
    INTERNAL_SERVER_ERROR(500, "服务维护中，请稍后重试！"),
    ;
    /**
     * 操作结果编号.
     */
    private Integer resultCode;

    /**
     * 操作结果信息.
     */
    private String resultMsg;
}
