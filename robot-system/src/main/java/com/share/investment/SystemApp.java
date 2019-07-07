package com.share.investment;

import com.share.investment.config.BaseConfig;
import com.share.investment.config.SwaggerConfig;
import com.share.investment.controller.SystemController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({BaseConfig.class, SwaggerConfig.class})
public class SystemApp {

    public static void main(String[] args) {
        SpringApplication.run(SystemApp.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            SystemController systemController = ctx.getBean("systemController",SystemController.class);
            systemController.testing();
        };

    }
}
