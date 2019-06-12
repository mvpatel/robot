package com.share.investment;

import com.share.investment.config.BaseConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({BaseConfig.class})
public class SystemApp {
    public static void main(String[] args) {
        System.out.println("Hi");
        SpringApplication.run(SystemApp.class, args);

        System.out.println("Hi222222222");
    }
}
