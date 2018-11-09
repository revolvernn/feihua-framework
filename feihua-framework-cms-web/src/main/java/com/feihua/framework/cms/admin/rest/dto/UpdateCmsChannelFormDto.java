package com.feihua.framework.cms.admin.rest.dto;

import com.feihua.framework.rest.dto.UpdateFormDto;
import java.util.Date;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cms_channel
 *
 * @mbg.generated 2018-11-09 16:45:29
*/
public class UpdateCmsChannelFormDto extends UpdateFormDto {
    private String name;

    private String path;

    private Integer sequence;

    private String siteId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }
}