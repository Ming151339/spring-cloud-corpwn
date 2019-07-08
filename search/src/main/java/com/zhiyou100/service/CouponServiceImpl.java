package com.zhiyou100.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhiyou100.entity.CouponEo;
import com.zhiyou100.kafka.KafkaMessage;
import com.zhiyou100.repository.CouponRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    private CouponRepository couponRepository;


    @Override
    public List<CouponEo> findAllByName(String name)
    {
        return couponRepository.findAllByName(name);
    }


    @KafkaListener(topics = "LwKafkaCoupon")
    public void addCouponeEo(String json) {

        try {

            // 1. 还原 json 为 kafkaMessage
            KafkaMessage<CouponEo> kafkaMessage = new ObjectMapper().readValue(json, new TypeReference<KafkaMessage<CouponEo>>() {
            });

            // 2. 根据 action 执行不同的操作
            switch (kafkaMessage.getAction()) {

                case 1: {

                    // 执行添加操作
                    couponRepository.save(kafkaMessage.getData());

                    break;
                }
                case 2: {

                    // 执行修改操作
                    couponRepository.save(kafkaMessage.getData());

                    break;
                }
                default: {

                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}