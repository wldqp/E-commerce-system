package com.macro.mall.tiny.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Description: Swagger2API文档的配置  // 类说明，在创建类时要填写
 * @ClassName: Swagger2Config    // 类名，会自动填充
 * @Author: weisn          // 创建者
 * @Date: 2022/7/23 17:14   // 时间
 * @Version: 1.0     // 版本
 */
public class Swagger2Config {

  @Bean
  public Docket createRestApi(){
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.macro.mall.tiny.controller"))
        .paths(PathSelectors.any())
        .build();
  }

  private ApiInfo apiInfo(){
    return new ApiInfoBuilder()
        .title("")
        .description("")
        .contact("macro")
        .version("1.0")
        .build();
  }
}
