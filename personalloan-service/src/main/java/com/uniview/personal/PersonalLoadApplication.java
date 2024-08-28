package com.uniview.personal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Kurt LEE
 * @created 2024/08/28 - 下午2:25
 */
@SpringBootApplication
@MapperScan("com.uniview.personal.mapper")
public class PersonalLoadApplication {
    public static void main(String[] args) {
        SpringApplication.run(PersonalLoadApplication.class, args);
    }
}