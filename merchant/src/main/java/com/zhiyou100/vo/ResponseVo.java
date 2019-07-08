package com.zhiyou100.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseVo<T> {
    private  Integer code;
    private  String  message;
    private  T data;
}
