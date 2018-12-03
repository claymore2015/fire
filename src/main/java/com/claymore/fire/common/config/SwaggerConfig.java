package com.claymore.fire.common.config;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author li.zhuo
 * @create 2018/10/26 上午9:53
 * @since 1.0.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket portalApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("fire-api").apiInfo(apiInfo())
                .select().apis(RequestHandlerSelectors.basePackage("com.claymore.fire")).paths(PathSelectors.any()).build();
        // .securitySchemes(newArrayList(oauth()))
        // .securityContexts(newArrayList(securityContext()));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Bamder portal API")
                .description(
                        "light rapid fire project")
                .termsOfServiceUrl("http://springfox.io").license("Apache License Version 2.0")
                .licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE").version("2.0")
                .build();
    }
}
