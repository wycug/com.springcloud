package com.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther wy
 * @create 2021/11/9 16:36
 */

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;
    public CommonResult(Integer code, String message){
        this(code, message, null);
    }
}
