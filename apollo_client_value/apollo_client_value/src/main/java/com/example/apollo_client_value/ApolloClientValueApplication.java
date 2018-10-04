package com.example.apollo_client_value;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.example.apollo_client_value.java.ConfigJavaBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@EnableApolloConfig
@SpringBootApplication
public class ApolloClientValueApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApolloClientValueApplication.class, args);
	}


}
