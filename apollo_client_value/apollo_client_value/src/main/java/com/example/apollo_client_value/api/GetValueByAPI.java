package com.example.apollo_client_value.api;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class GetValueByAPI {

    @PostConstruct
    public void getValue(){
        Config config = ConfigService.getAppConfig();
        String key = "changeKey";
        String defaultValue = "apollo_client";
        String value = config.getProperty(key,defaultValue);
        System.out.println(String.format("value is %s",value));
    }
}
