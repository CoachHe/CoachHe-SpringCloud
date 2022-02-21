package com.coachhe.springcloud.dao;

import com.coachhe.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * PaymentDao
 * @author heyizhi
 */
@Mapper
public interface PaymentDao {
    /**
     * 根据输入支付参数创建一条记录
     * @param payment payment
     * @return int
     */
    int create(Payment payment);

    /**
     * 根据支付id获取支付信息
     * @param id 支付id
     * @return 支付信息payment
     */
    Payment getPaymentById(@Param("id") Long id);

}
