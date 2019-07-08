package com.zhiyou100.eneity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "coupon")
public class CouponDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String name;
    private  String description;
    private  Integer count;
    private  Integer type;
}
