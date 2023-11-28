
package com.example.mongo.mongo.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
@RequiredArgsConstructor
public class OpenApiConfiguration {

    private static final String BEARER_KEY = "BEARER_";
    private final String headerName = "header";


    @Bean
    public OpenAPI openApi() {
        return new
                OpenAPI()
                .info(apiInfo())
                .components(apiComponents())
                .addSecurityItem(new SecurityRequirement().addList(BEARER_KEY).addList(headerName));
    }


    private Components apiComponents() {
        return new Components()
                .addSecuritySchemes(BEARER_KEY,
                        new SecurityScheme()
                                .type(SecurityScheme.Type.HTTP)
                                .in(SecurityScheme.In.HEADER)
                                .scheme("bearer"))
                .addSecuritySchemes(headerName,
                        new SecurityScheme()
                                .type(SecurityScheme.Type.APIKEY)
                                .in(SecurityScheme.In.HEADER)
                                .name(headerName));
    }



    private Info apiInfo() {
        var year = Integer.toString(LocalDate.now().getYear());
        return new Info()
                .title("titlr")
                .description("sdfsdfad")
                .version("dsafasd")
                .license(new License().name(String.format("© %s Rinteh, Inc. All Rights Reserved.", year)));
    }
}
