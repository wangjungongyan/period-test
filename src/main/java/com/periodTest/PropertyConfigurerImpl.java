package com.periodTest;

/**
 * Created by vali on 15-5-14.
 */
public class PropertyConfigurerImpl implements PropertyConfigurer {

    private String key;

    @Override public String returnKey() {
        return key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
