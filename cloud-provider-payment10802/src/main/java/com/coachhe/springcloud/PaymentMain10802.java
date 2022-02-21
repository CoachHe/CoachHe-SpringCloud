package com.coachhe.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * PaymentMain10802的主启动类
 * @author heyizhi
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain10802 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain10802.class, args);
    }
}
