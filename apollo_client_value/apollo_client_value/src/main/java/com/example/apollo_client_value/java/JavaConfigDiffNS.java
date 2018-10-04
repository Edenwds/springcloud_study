package com.example.apollo_client_value.java;


import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig(value = {"javaconfig"},order = 2)
public class JavaConfigDiffNS {

    @Bean
    public ConfigJavaBean2 configJavaBean2(){
        return new ConfigJavaBean2();
    }

}
