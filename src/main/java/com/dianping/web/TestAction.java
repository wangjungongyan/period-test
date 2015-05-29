package com.dianping.web;

import com.dianping.period.client.PeriodClientUtil;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

    private static final long serialVersionUID = 6407952459919768455L;

    private String key;

    private String value = "";

    private PropertyConfigurer propertyConfigurer;

    public String execute() throws Exception {
        String val = propertyConfigurer.returnKey();
        //value = (String) PeriodClientUtil.getProperty(key);
        //PeriodServerUtil.updateNode("period.child3", "ddd", "alpha");
//
//        PeriodServerUtil.createPersistentNode("period.child4", "2", "alpha");
//
//        PeriodServerUtil.deleteNode("period.child4","alpha");
        PeriodClientUtil.getChildrenProperties("period", "alpha");
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
