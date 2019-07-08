package com.zhiyou100.service;

import com.zhiyou100.entity.CouponEo;

import java.util.List;

public interface CouponService {
    List<CouponEo>  findAllByName(String name);
}
