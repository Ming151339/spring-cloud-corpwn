package com.zhiyou100.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "receive_coupons",type = "coupon" )
//??????????????????????
@Data
public class CouponEo {
    @Field(type = FieldType.Keyword)
    @Id
    private Integer id;
    @Field(type = FieldType.Text)
    private  String name;
    @Field(type = FieldType.Text)
    private  String description;
    @Field(type = FieldType.Keyword)
    private  Integer count;
    @Field(type = FieldType.Keyword)
    private  Integer type;



}
