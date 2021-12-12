package com.ng.mall.util;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author: wuyb
 * Date: 2021/12/10
 */
@Getter
@Setter
@NoArgsConstructor
public class RespResult<T> implements Serializable {
    private T data;
    private Integer code;
    private String message;
}
