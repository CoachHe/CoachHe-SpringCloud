package com.coachhe.springcloud.service;

import com.coachhe.springcloud.dao.PaymentDao;
import com.coachhe.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author heyizhi
 */
@Service
public class PaymentServiceImpl implements PaymentService{
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }

}
