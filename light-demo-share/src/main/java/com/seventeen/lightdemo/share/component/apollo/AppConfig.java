package com.seventeen.lightdemo.share.component.apollo;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 获取apollo配置的属性
 * 使用该方式获取配置，在配置中心修改配置之后，生效不需要重启
 * @author seventeen
 */
@Configuration
public class AppConfig {

    @Value("${spring.redis.prefix}")
    @Getter
    private String redisPrefix;

}
