package com.seventeen.lightdemo.share.component;

import com.seventeen.lightdemo.share.component.apollo.AppConfig;
import com.seventeen.lightdemo.share.component.convertor.ConverterFacade;
import com.seventeen.lightdemo.share.component.convertor.impl.ConverterFacadeImpl;
import com.seventeen.lightdemo.share.component.redis.RedisFacade;
import com.seventeen.lightdemo.share.component.redis.impl.RedisFacadeImpl;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

/**
 * 组件定位器
 *
 * @author xia_xun
 */
@Component
public class ComponentLocator implements ApplicationContextAware {

    private static ConverterFacade converterFacade;
    private static RedisFacade redisFacade;
    private static AppConfig appConfig;
    private static ApplicationContext applicationContext;

    public static <T> T getBean(Class<T> clz) {
        return applicationContext.getBean(clz);
    }

    public static ConverterFacade getConverter() {
        if (converterFacade == null) {
            converterFacade = getBean(ConverterFacadeImpl.class);
        }
        return converterFacade;
    }

    public static RedisFacade getRedis() {
        if (redisFacade == null) {
            redisFacade = getBean(RedisFacadeImpl.class);
        }
        return redisFacade;
    }

    public static AppConfig getAppConfig() {
        if (appConfig == null) {
            appConfig = getBean(AppConfig.class);
        }
        return appConfig;
    }

    @Override
    public void setApplicationContext(@NonNull ApplicationContext applicationContext) throws BeansException {
        ComponentLocator.applicationContext = applicationContext;
    }

}
