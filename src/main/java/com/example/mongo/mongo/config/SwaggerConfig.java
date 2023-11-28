package com.example.mongo.mongo.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi contentOpenApi() {
        return GroupedOpenApi.builder()
                .group("content")
                .packagesToScan("com.example.mongo")
                .build();
    }

}
