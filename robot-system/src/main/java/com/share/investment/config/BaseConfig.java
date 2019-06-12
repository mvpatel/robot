package com.share.investment.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Base configuration for teh System, handles configuration of SpringBoot  .
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.share.investment.*"})
@EntityScan(basePackages = {"com.share.investment.model.dao"})
@EnableJpaRepositories(basePackages = {"com.share.investment.repository"})
public class BaseConfig {
    
}