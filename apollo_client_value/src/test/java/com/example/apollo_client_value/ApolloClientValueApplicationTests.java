package com.example.apollo_client_value;

import com.example.apollo_client_value.java.ConfigJavaBean;
import com.example.apollo_client_value.java.ConfigJavaBean2;
import com.example.apollo_client_value.springboot.RedisConInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApolloClientValueApplicationTests {

	@Autowired
	private ConfigJavaBean2 configJavaBean2;

	@Autowired
	private ConfigJavaBean configJavaBean;

	@Autowired
	private RedisConInfo redisConInfo;

	@Test
	public void contextLoads() {
	}

	@Test
	public void javaConfigTest(){
		System.out.println(String.format("oneKey: %s, twoKey: %s",configJavaBean.getOneKey(),configJavaBean.getTwoKey()));

		System.out.println(String.format("twoKey: %s, threeKey: %s",configJavaBean2.getTwoKey(),configJavaBean2.getThreeKey()));
	}

	@Test
	public void springbootConfigTest(){
		System.out.println(String.format("redis.host = %s, redis.port = %s",redisConInfo.getHost(),redisConInfo.getPort()));
	}

}
