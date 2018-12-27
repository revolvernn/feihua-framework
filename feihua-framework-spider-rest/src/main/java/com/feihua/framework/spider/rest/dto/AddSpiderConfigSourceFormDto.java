package com.feihua.framework.spider.rest.dto;

import java.util.Date;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table spider_config_source
 *
 * @mbg.generated 2018-12-19 17:13:35
*/
public class AddSpiderConfigSourceFormDto {

    private String name;

    private String domain;

    private String isDynamic;

    private Integer dynamicWait;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getIsDynamic() {
        return isDynamic;
    }

    public void setIsDynamic(String isDynamic) {
        this.isDynamic = isDynamic;
    }

    public Integer getDynamicWait() {
        return dynamicWait;
    }

    public void setDynamicWait(Integer dynamicWait) {
        this.dynamicWait = dynamicWait;
    }
}