package com.uniview.personal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Kurt LEE
 * @created 2024/08/28 - 下午2:25
 */
@EnableFeignClients
@SpringBootApplication
@MapperScan("com.uniview.personal.mapper")
public class PersonalLoadApplication {
    public static void main(String[] args) {
        SpringApplication.run(PersonalLoadApplication.class, args);
    }
}