package com.zhiyou100.repository;

import com.zhiyou100.entity.CouponEo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface CouponRepository extends ElasticsearchRepository<CouponEo,Integer> {
    List<CouponEo> findAllByName(String name);
}
