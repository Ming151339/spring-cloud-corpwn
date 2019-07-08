package com.zhiyou100.kafka;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // 添加没有任何参数的构造方法
@AllArgsConstructor // 添加包含所有参数的构造方法
public class KafkaMessage<T> {
    // CRUD , 1234 四个操作  没有查
    private Integer action;
    // 具体的数据
    private  T data;
}
