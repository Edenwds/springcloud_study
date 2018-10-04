package com.example.apollo_client_value.java;

import org.springframework.beans.factory.annotation.Value;

public class ConfigJavaBean2 {

    @Value("${twoKey:22222}")
    private String twoKey;

    @Value("${threeKey:33333key}")
    private String threeKey;

    public String getTwoKey() {
        return twoKey;
    }

    public void setTwoKey(String twoKey) {
        this.twoKey = twoKey;
    }

    public String getThreeKey() {
        return threeKey;
    }

    public void setThreeKey(String threeKey) {
        this.threeKey = threeKey;
    }
}
