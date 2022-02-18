package com.coachhe.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka主启动类2，端口10702
 * @author CoachHe
 * @date 2022/1/19 12:12 AM
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain10702 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain10702.class, args);
    }
}
