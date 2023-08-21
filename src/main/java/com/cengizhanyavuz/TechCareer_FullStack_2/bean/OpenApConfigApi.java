package com.cengizhanyavuz.TechCareer_FullStack_2.bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApConfigApi {
    @Bean
    public OpenAPI openApiMethod() {
        return new OpenAPI().info(new Info()
                .description("blog tanımlama")
                .version("1.0")
                .title("blog").termsOfService("Software INC"));
    }
}
