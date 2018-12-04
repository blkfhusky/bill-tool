package com.blkfhusky.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author blkfhusky
 * <p>
 * web server
 * <p>
 * 关于两者区别 @EnableDiscoveryClient，@EnableEurekaClient
 * https://blog.csdn.net/u012734441/article/details/78256256
 */
@SpringBootApplication
@EnableEurekaClient
public class WebServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebServerApplication.class, args);
    }
}
