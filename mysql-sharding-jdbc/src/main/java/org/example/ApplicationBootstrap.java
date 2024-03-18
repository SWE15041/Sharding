package org.example;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
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
//@RestController
//@EnableAspectJAutoProxy
@SpringBootConfiguration
//@EnableEncryptableProperties
@Slf4j
//@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ApplicationBootstrap {
    public static void main(String[] args) {
//        new JDBCExampleGenerator().generate();
        SpringApplication.run(ApplicationBootstrap.class, args);
        printMessages();
    }

    private static void printMessages() {
        log.info("Example codes are generated successful!");
        log.info("Please find them in folder `shardingsphere-jdbc-sample`.");
    }
}
