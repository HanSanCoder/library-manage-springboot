package com.book.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.book.app.dao")
@EnableTransactionManagement
public class SpringbootBooksApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBooksApplication.class, args);
    }

}
