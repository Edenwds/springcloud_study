package com.example.apollo_client_value.springboot;


import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig(value = {"redis"},order = 3)
public class RedisConfig {

    @Bean
    @RefreshScope
    public RedisConInfo redisConInfo(){
        return new RedisConInfo();
    }
}
