package com.blkfhusky.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author blkfhusky
 *
 * core server
 */
@SpringBootApplication
@EnableEurekaClient
public class CoreServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoreServerApplication.class, args);
    }
}
