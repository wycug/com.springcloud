package com.springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   //添加@data 可以不用设置Getter,Setter,equals,canEqual,hasCode,toString方法
@AllArgsConstructor
/*public test1(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        }*/
@NoArgsConstructor
/*
 public test1() {
    }
 */
public class CommonResult<T> {

    //404
    private  Integer code;
    private  String message;
    private T data;

    public CommonResult(Integer code, String message){
        this(code, message, null);
    }
}
