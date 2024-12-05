package org.example.spsapi.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@OpenAPIDefinition(
        info =@Info(title = "java API" , description = "자바용 api 명세서 입니다.",version = "v2")
)
@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi javaOpenApi(){
        String[] paths ={"/**"};
        return GroupedOpenApi.builder()
                .group("Sample v1")
                .pathsToMatch(paths)
                .build();
    }

}
