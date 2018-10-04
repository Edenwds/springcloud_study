package com.example.apollo_client_value.springboot.refresh;

import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import com.example.apollo_client_value.springboot.RedisConInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.scope.refresh.RefreshScope;
import org.springframework.stereotype.Component;

@Component
public class RedisConfigRefresh {

    private static final Logger logger = LoggerFactory.getLogger(RedisConfigRefresh.class);

    @Autowired
    private RedisConInfo redisConInfo;

    @Autowired
    private RefreshScope refreshScope;

    @ApolloConfigChangeListener({"redis"})
    public void onChange(ConfigChangeEvent changeEvent){
        boolean ischanged = false;
        for(String changeKey : changeEvent.changedKeys()){
            if(changeKey.startsWith("redis")){
                ischanged = true;
                break;
            }
        }
        if(!ischanged){
            return;
        }
        logger.info("before refresh {}",redisConInfo.getHost() + " : " + redisConInfo.getPort());
        refreshScope.refresh("redisConInfo");
//        refreshScope.refreshAll();  //refresh all
        logger.info("after refresh {}",redisConInfo.getHost() + " :  " + redisConInfo.getPort());
    }
}
