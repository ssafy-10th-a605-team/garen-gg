package org.example.garencrawling.global;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class SpringAsyncConfig {

    @Bean(name = "threadPoolTaskExecutor")
    public Executor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(GlobalConstants.corePoolSize);
        taskExecutor.setMaxPoolSize(GlobalConstants.maxPoolSize);
        taskExecutor.setQueueCapacity(GlobalConstants.queueCapacity);
        taskExecutor.setThreadNamePrefix("Executor-");
        return taskExecutor;
    }

}