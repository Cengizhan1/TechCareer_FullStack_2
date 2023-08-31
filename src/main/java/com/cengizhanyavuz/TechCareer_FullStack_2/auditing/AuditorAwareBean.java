package com.cengizhanyavuz.TechCareer_FullStack_2.auditing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

@Configuration
public class AuditorAwareBean {
    @Bean
    public AuditorAware<String> auditorAwareBeanMethod(){
        return  new AuditorAwareImpl();
    }
}