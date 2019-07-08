package com.zhiyou100.controller;

import com.zhiyou100.entity.CouponEo;
import com.zhiyou100.service.CouponService;

import com.zhiyou100.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: lw
 * @Date: 2019/6/20 10:34
 */
@RestController
public class CouponController {

    @Autowired
    private CouponService couponService;

    @GetMapping("/coupons")
    public ResponseVo<List<CouponEo>> findAllByName(@RequestParam("name") String name) {

        List<CouponEo> list = couponService.findAllByName(name);

        return new ResponseVo<>(200, "", list);
    }
}
