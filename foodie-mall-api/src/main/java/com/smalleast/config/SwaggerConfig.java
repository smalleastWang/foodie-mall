package com.smalleast.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    // http://localhost:8080/swagger-ui.html
    // http://localhost:8080/doc.html
    // swagger2 核心配置
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2) // 指定api类型
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.smalleast.controller")) // 指定controller包
                .paths(PathSelectors.any()) // 所有controller
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("foodie-mall 接口文档")
                .contact(new Contact("foodie-mall", "https://baidu.com", "smalleast666@gmail.com")) // 联系人信息
                .description("foodie-mall 接口文档 desc")
                .version("v1.0.1")
                .termsOfServiceUrl("https://baidu.com")
                .build();
    }

}