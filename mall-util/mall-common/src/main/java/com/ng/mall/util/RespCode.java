package com.ng.mall.util;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author: wuyb
 * Date: 2021/12/10
 */
@NoArgsConstructor
@AllArgsConstructor
public enum RespCode {
    SUCCESS(2000, "操作成功"),
    FAILED(5000, "操作失败"),
    ERROR(5001, "系统异常");

    private Integer code;
    private String message;

}
