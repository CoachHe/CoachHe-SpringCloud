package com.coachhe.springcloud.service;

import com.coachhe.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author heyizhi
 */
public interface PaymentService {
    /**
     * 根据输入参数创建一条记录
     * @param payment 输入支付参数
     * @return int
     */
    public int create(Payment payment);

    /**
     * 根据支付id获取支付信息
     * @param id 支付id
     * @return Payment
     */
    public Payment getPaymentById(@Param("id") Long id);

}
