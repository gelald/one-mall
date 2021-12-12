package com.ng.mall.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author: wuyb
 * Date: 2021/12/10
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum RespCode {
    /**
     * 操作成功
     */
    SUCCESS(2000, "操作成功"),
    /**
     * 操作失败
     */
    FAILED(5000, "操作失败"),
    /**
     * 服务器异常
     */
    ERROR(5001, "系统异常");

    private Integer code;
    private String message;

}
