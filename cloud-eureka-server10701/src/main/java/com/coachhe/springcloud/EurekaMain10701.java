package com.coachhe.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka的主启动类1，端口10501
 * EnableEurekaServer表示这为Eureka的服务端
 * @author CoachHe
 * @date 2022/1/17 1:26 AM
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain10701 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain10701.class, args);
    }
}
