package com.uniview.postloan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Kurt LEE
 * @created 2024/08/27 - 下午4:03
 */
@SpringBootApplication
@MapperScan("com.uniview.postloan.mapper")
public class PostLoanApplication {
    public static void main(String[] args) {
        SpringApplication.run(PostLoanApplication.class, args);
    }
}