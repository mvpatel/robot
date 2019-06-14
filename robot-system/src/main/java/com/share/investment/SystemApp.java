package com.share.investment;

import com.share.investment.config.BaseConfig;
import com.share.investment.controller.SystemController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({BaseConfig.class})
public class SystemApp {


    public static void main(String[] args) {
        System.out.println("Hi");
        SpringApplication.run(SystemApp.class, args);
        System.out.println("Hi222222222");
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            SystemController systemController = ctx.getBean("systemController",SystemController.class);
            systemController.addShare();
        };

    }
}
