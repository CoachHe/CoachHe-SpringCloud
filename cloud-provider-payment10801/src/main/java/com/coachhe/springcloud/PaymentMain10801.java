package com.coachhe.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * PaymentMain10801的主启动类
 * @author heyizhi
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain10801 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain10801.class, args);
    }
}
