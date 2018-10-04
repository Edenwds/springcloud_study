package com.example.apollo_client_value.java;


import org.springframework.beans.factory.annotation.Value;

public class ConfigJavaBean {

    @Value("${oneKey:defaultValue}")
    private String oneKey;

    @Value("${twoKey:22}")
    private String twoKey;

    public String getOneKey() {
        return oneKey;
    }

    public void setOneKey(String oneKey) {
        this.oneKey = oneKey;
    }

    public String getTwoKey() {
        return twoKey;
    }

    public void setTwoKey(String twoKey) {
        this.twoKey = twoKey;
    }
}
