package com.feihua.framework.cms.dto;

import feihua.jdbc.api.pojo.BaseConditionDto;
import java.util.Date;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cms_content
 *
 * @mbg.generated 2018-11-09 16:57:39
*/
public class SearchCmsContentsConditionDto extends BaseConditionDto {

    private String title;

    private String author;

    private String status;

    private String siteId;

    private String channelId;

    private String content;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}