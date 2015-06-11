package com.periodTest;

import com.opensymphony.xwork2.ActionSupport;
import com.period.client.PeriodClientUtil;
import com.period.common.PeriodEntity;
import org.apache.struts2.json.JSONUtil;

import java.util.Map;

public class TestAction extends ActionSupport {

    private static final long serialVersionUID = 6407952459919768455L;

    private String key;

    private String value = "";

    private Map<String, PeriodEntity> chilren = null;

    private PropertyConfigurer propertyConfigurer;

    public String execute() throws Exception {
        //String val = propertyConfigurer.returnKey();
        // PeriodServerUtil.createPersistentNode("ly-service.child1", "2", "alpha");
        //PeriodServerUtil.updateNode("ly-service.child1", "ddd", "alpha");
        chilren = PeriodClientUtil.getChildrenProperties("ly-service");
        //value = (String) PeriodClientUtil.getProperty("ly-service.child1");
        //PeriodServerUtil.deleteNode("ly-service.child1", "alpha");
        //System.out.println("ly-service.child1:" + value);
        value = JSONUtil.serialize(chilren);
        System.out.println("chilren:" + value);
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
