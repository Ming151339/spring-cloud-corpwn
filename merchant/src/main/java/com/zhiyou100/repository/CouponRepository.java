package com.zhiyou100.repository;

import com.zhiyou100.eneity.CouponDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface CouponRepository extends JpaRepository<CouponDo,Integer> {



}
