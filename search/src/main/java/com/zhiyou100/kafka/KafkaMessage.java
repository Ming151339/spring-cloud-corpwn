package com.zhiyou100.kafka;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: lw
 * @Date: 2019/6/20 9:35
 */
@Data
@NoArgsConstructor // 添加无参构造方法
@AllArgsConstructor // 添加包含所有参数的构造方法
public class KafkaMessage<T> {

    // 1 = add, 2 == update, 3 == delete
    private Integer action;

    // 具体的数据
    private T data;
}
