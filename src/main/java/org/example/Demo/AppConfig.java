package org.example.Demo;

import org.example.loose.NotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {
    @Bean(initMethod = "init",destroyMethod = "cleanup")
    public LifeCycleBean lifeCycleBean (NotificationService notificationService){
        return new LifeCycleBean(notificationService);
    }

}
