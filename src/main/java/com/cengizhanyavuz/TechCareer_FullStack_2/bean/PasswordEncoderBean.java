package com.cengizhanyavuz.TechCareer_FullStack_2.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class PasswordEncoderBean {
    @Bean
    public BCryptPasswordEncoder passwordEncoderBeanMethod() {
        return new BCryptPasswordEncoder();
    }
}
