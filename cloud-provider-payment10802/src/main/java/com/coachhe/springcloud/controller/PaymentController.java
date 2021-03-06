package com.coachhe.springcloud.controller;

import com.coachhe.springcloud.entities.CommonResult;
import com.coachhe.springcloud.entities.Payment;
import com.coachhe.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Payment10802的主启动类
 * @author heyizhi
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("server.port")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult<String> create(Payment payment) {
        int result = paymentService.create(payment);
        log.info("*******插入结果： " + result);

        if (result > 0) {
            return new CommonResult<>(200, "插入数据库成功, serverPort: " + serverPort,
                    "success");
        } else {
            return new CommonResult<>(444, "插入数据库失败", null);
        }

    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*******插入结果： " + payment);

        if (payment != null) {
            return new CommonResult<>(200, "查询数据库成功", payment);
        } else {
            return new CommonResult<>(444, "没有对应记录，查询ID: " + id, null);
        }
    }


}
