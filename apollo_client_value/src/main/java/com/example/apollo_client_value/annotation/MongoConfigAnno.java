package com.example.apollo_client_value.annotation;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig({"mongo"})
public class MongoConfigAnno {
    
    private static final Logger logger = LoggerFactory.getLogger(MongoConfigAnno.class);

    @ApolloConfig("mongo") //inject config for namespace mongo
    private Config config;

    @Value("${mongo.host:localhost}")
    private String host;

    @Value("${mongo.port:1234}")
    private String port;

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    @ApolloConfigChangeListener("mongo")
    private void someOnChange(ConfigChangeEvent changeEvent){
        
        logger.info("before update {} ",this.toString());
        
        if(changeEvent.isChanged("mongo.host")){
            this.host = config.getProperty("mongo.host","defaultValue");
        }
        if(changeEvent.isChanged("mongo.port")){
            this.port = config.getProperty("mongo.port","1234");
        }
        
        logger.info("after update {} ",this.toString());
    }

    @Override
    public String toString() {
        return String.format("mongo configuration--- host: %s  port: %s",this.host,this.port);
    }
}
