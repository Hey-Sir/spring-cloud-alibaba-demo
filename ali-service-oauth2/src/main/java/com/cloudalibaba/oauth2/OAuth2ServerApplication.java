package com.cloudalibaba.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * description: oauth2 授权启动类
 *
 * @author MagicHat
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.cloudalibaba"})
@EnableDiscoveryClient
@MapperScan(basePackages = "com.cloudalibaba.commons.mapper")
@EnableFeignClients
public class OAuth2ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ServerApplication.class,args);
    }

}
