package com.zhiyou100.service.Impl;

import com.zhiyou100.eneity.CouponDo;
import com.zhiyou100.kafka.KafkaMessage;
import com.zhiyou100.repository.CouponRepository;
import com.zhiyou100.service.CouponService;
import com.zhiyou100.util.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    private CouponRepository couponRepository;
    @Autowired
    private KafkaTemplate kafkaTemplate;


    @Override
    public CouponDo addCoupon(CouponDo couponDo) {
        // 1. 在 mysql 添加数据
        couponRepository.save(couponDo);

        // 2. 封装 couponDo 为 KafkaMessage
        KafkaMessage<CouponDo> kafkaMessage = new KafkaMessage<>(1, couponDo);

        // 3. 把 kafkaMessage 转换为 json 格式的字符串
        String json = JSONUtils.object2Json(kafkaMessage);

        // 4. 把 json 放入 kafka 中
        kafkaTemplate.send("LwKafkaCoupon", json);

        return couponDo ;
    }

    @Override
    public CouponDo updateCoupon(CouponDo couponDo) {
        // 1. 在 mysql 添加数据
        couponRepository.save(couponDo);

        // 2. 封装 couponDo 为 KafkaMessage
        KafkaMessage<CouponDo> kafkaMessage = new KafkaMessage<>(2, couponDo);

        // 3. 把 kafkaMessage 转换为 json 格式的字符串
        String json = JSONUtils.object2Json(kafkaMessage);

        // 4. 把 json 放入 kafka 中
        kafkaTemplate.send("LwKafkaCoupon", json);

        return couponDo;
    }
}
