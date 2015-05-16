package com.dianping.web;

import com.dianping.period.client.PeriodClientUtil;
import com.dianping.period.server.PeriodServerUtil;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

    private static final long serialVersionUID = 6407952459919768455L;

    private String key;

    private String value = "";

    private PropertyConfigurer propertyConfigurer;

    public String execute() throws Exception {
        String val = propertyConfigurer.returnKey();
        value = (String) PeriodClientUtil.getProperty(key);
        PeriodServerUtil.updateNode("period.child3333", "ddd");
        return SUCCESS;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PropertyConfigurer getPropertyConfigurer() {
        return propertyConfigurer;
    }

    public void setPropertyConfigurer(PropertyConfigurer propertyConfigurer) {
        this.propertyConfigurer = propertyConfigurer;
    }

}
