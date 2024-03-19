package org.example;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 */
@EntityScan(basePackages = {"org.example"})
@SpringBootApplication(scanBasePackages = {"org.example"})
@MapperScan(basePackages = {"org.example.domain", "org.example.mapper"})
@ComponentScan
@SpringBootConfiguration
@Slf4j
public class ApplicationBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationBootstrap.class, args);
    }

}
