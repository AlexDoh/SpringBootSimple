package com.odmytrenko.spring.configuration;

import com.odmytrenko.spring.model.Event;
import com.odmytrenko.spring.model.TimeLapse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.odmytrenko.spring.*")
@EntityScan(basePackageClasses = {Event.class, TimeLapse.class})
@PropertySource("classpath:application.properties")
public class AppConfig {


    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class);
    }

    @Bean
    public HibernateJpaSessionFactoryBean sessionFactory() {
        return new HibernateJpaSessionFactoryBean();
    }

}
