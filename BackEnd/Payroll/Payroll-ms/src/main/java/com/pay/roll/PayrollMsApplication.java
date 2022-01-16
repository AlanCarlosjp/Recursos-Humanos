package com.pay.roll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@RibbonClient(name = "worker-ms")
@EnableFeignClients
@SpringBootApplication
public class PayrollMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayrollMsApplication.class, args);
    }

}
