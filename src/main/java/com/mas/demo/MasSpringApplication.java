package com.mas.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
//import org.springframework.validation.Validator;
import javax.validation.Validator;

@SpringBootApplication
public class MasSpringApplication implements RepositoryRestConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(MasSpringApplication.class, args);
    }

//    @Override
//    public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener validatingListener) {
//        validatingListener.addValidator("beforeCreate", validator());
//        validatingListener.addValidator("beforeSave", validator());
//
//    }

    @Bean
    public Validator validator() {
        return new LocalValidatorFactoryBean();
    }
}
