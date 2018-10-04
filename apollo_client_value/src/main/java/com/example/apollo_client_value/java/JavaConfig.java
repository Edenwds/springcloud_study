package com.example.apollo_client_value.java;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig(order = 1)
public class JavaConfig {

    @Bean
    public ConfigJavaBean configJavaBean(){
        ConfigJavaBean configJavaBean =  new ConfigJavaBean();
        return configJavaBean;
    }
}
