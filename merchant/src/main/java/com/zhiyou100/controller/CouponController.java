package com.zhiyou100.controller;

import com.zhiyou100.eneity.CouponDo;
import com.zhiyou100.service.CouponService;
import com.zhiyou100.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CouponController {

    @Autowired
    private CouponService couponService;
    @PostMapping("/coupons")
    public ResponseVo<CouponDo> addCouponDo(@RequestBody CouponDo couponDo){
        couponService.addCoupon(couponDo);
        return  new ResponseVo<CouponDo>(200,"",couponDo);
    }
    @PutMapping("/coupons")
    public ResponseVo<CouponDo> updateCouponDo(@RequestBody CouponDo couponDo){
        couponService.updateCoupon(couponDo);
        return  new ResponseVo<CouponDo>(200,"",couponDo);
    }

}
