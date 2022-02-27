package com.seventeen.lightdemo.share.component.apollo;

import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Configuration;

import java.util.Set;

/**
 * @author seventeen
 */
@Slf4j
@Configuration
@AllArgsConstructor
@ConditionalOnClass(com.ctrip.framework.apollo.Apollo.class)
public class ApolloPropertiesRefresher {
    private final ApplicationEventPublisher eventPublisher;

    @ApolloConfigChangeListener
    public void onChange(ConfigChangeEvent changeEvent) {
        Set<String> changedKeys = changeEvent.changedKeys();

        log.info("Apollo Refreshing properties changedKeys:{}!", changedKeys);

        eventPublisher.publishEvent(new EnvironmentChangeEvent(changeEvent.changedKeys()));

        log.info("Apollo Refreshing properties refreshed!");
    }

}