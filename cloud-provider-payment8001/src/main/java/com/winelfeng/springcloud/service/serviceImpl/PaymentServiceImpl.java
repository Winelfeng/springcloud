package com.winelfeng.springcloud.service.serviceImpl;

import com.winelfeng.springcloud.dao.PaymentDao;
import com.winelfeng.springcloud.entities.Payment;
import com.winelfeng.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author lsf
 * @Date 2020/7/6
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
