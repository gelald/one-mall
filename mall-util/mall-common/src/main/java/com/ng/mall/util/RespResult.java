package com.ng.mall.util;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class RespResult<T> implements Serializable {
    /**
     * 响应数据
     */
    private T data;
    /**
     * 响应状态码
     *
     * @see RespCode
     */
    private Integer code;
    /**
     * 响应信息
     */
    private String message;

    public RespResult(RespCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }

    public RespResult(T data, RespCode resultCode) {
        this.data = data;
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }

    public static RespResult<?> ok() {
        return new RespResult<>(null, RespCode.SUCCESS);
    }

    public static <T> RespResult<T> ok(T data) {
        return new RespResult<>(data, RespCode.SUCCESS);
    }

    public static RespResult<?> error() {
        return new RespResult<>(null, RespCode.ERROR);
    }

    public static RespResult<?> error(RespCode resultCode) {
        return new RespResult<>(resultCode);
    }

    public static RespResult<?> error(String message) {
        return secByError(RespCode.ERROR.getCode(), message);
    }

    //自定义异常
    public static RespResult<?> secByError(Integer code, String message) {
        RespResult<?> err = new RespResult<>();
        err.setCode(code);
        err.setMessage(message);
        return err;
    }
}
