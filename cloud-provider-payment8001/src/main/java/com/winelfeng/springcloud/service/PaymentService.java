package com.winelfeng.springcloud.service;

import com.winelfeng.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Description TODO
 * @Author lsf
 * @Date 2020/7/6
 **/
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
