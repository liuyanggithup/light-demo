package com.seventeen.lightdemo.web.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger文档配置
 *
 * @author seventeen
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 接口标题
     */
    private String apiTitle;

    /**
     * 接口描述
     */
    private String apiDesc;

    /**
     * 文档版本号
     */
    private String version;

    public SwaggerConfig() {
        this.apiTitle = "自研推送系统管理接口";
        this.version = "1.0-SNAPSHOT";

        StringBuilder sb = new StringBuilder();
        sb.append("<strong>平台测试服务器：test-api.light.com</strong>");
        sb.append("<br />");
        sb.append("<strong>接口基础参数</strong>");
        sb.append("<br />");
        sb.append("appKey : 平台来源");
        sb.append("<br />");
        sb.append("version : 版本号");
        sb.append("<br />");
        sb.append("deviceId : 设备号");
        sb.append("<br />");
        sb.append("timestamp : 时间戳");
        sb.append("<br />");
        sb.append("sign : 接口签名");
        sb.append("<br />");
        sb.append("token : 登录令牌,登录后传该参数");
        this.apiDesc = sb.toString();
    }


    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(true)
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.seventeen.lightdemo.web.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(createApiInfo());
    }

    private ApiInfo createApiInfo() {
        return new ApiInfoBuilder()
                .title(apiTitle)
                .version(version)
                .description(apiDesc)
                .build();
    }

}
