package com.lyt.usercentre.approval;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients(basePackages = "com.lyt.usercentre.approval.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class UsercentreApprovalApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsercentreApprovalApplication.class, args);
    }

}
