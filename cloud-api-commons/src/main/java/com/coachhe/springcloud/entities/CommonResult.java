package com.coachhe.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author heyizhi
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    /**
     * 404
     */
    private Integer code;

    /**
     * NOT FOUND
     */
    private String message;

    /**
     * 通用返回类型，如果是Payment就返回一个Payment
     */
    private T data;

}
