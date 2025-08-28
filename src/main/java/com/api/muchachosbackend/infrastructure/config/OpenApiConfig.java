package com.api.muchachosbackend.infrastructure.config;

import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public GroupedOpenApi api() {
        return GroupedOpenApi.builder()
                .group("mc2025")
                .addOpenApiCustomizer(openApi -> openApi.info(new Info()
                        .title("MC2025 API")
                        .version("v1")
                        .description("API Hexagonal para web Muchachos de Consolación")))
                .pathsToMatch("/api/**")
                .build();
    }
}