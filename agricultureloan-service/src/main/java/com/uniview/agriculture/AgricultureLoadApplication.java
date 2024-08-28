package com.uniview.agriculture;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Kurt LEE
 * @created 2024/08/27 - 下午4:05
 */
@SpringBootApplication
@MapperScan("com.uniview.agriculture.mapper")
public class AgricultureLoadApplication {
    public static void main(String[] args) {
        SpringApplication.run(AgricultureLoadApplication.class, args);
    }
}