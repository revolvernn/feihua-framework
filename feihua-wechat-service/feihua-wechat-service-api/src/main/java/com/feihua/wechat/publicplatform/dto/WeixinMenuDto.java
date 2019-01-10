package com.feihua.wechat.publicplatform.dto;

import feihua.jdbc.api.pojo.BaseDbDto;
import feihua.jdbc.api.pojo.BaseDto;
import java.util.Date;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table weixin_menu
 *
 * @mbg.generated 2018-08-17 14:59:27
*/
public class WeixinMenuDto extends BaseDbDto<String> {
    private String id;

    private String name;

    private String key;

    private String type;

    private String url;

    private String mediaId;

    private String appid;

    private String pagepath;

    private Integer sequence;

    private String which;

    private Integer level;

    private String parentId;

    private String parentId1;

    private String parentId2;

    private String parentId3;

    private String parentId4;

    private String parentId5;

    private String parentId6;

    private String parentId7;

    private String parentId8;

    private String parentId9;

    private String parentId10;

    private String dataUserId;

    private String dataOfficeId;

    private String dataType;

    private String dataAreaId;

    private String delFlag;

    private Date createAt;

    private String createBy;

    private Date updateAt;

    private String updateBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getPagepath() {
        return pagepath;
    }

    public void setPagepath(String pagepath) {
        this.pagepath = pagepath;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getWhich() {
        return which;
    }

    public void setWhich(String which) {
        this.which = which;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentId1() {
        return parentId1;
    }

    public void setParentId1(String parentId1) {
        this.parentId1 = parentId1;
    }

    public String getParentId2() {
        return parentId2;
    }

    public void setParentId2(String parentId2) {
        this.parentId2 = parentId2;
    }

    public String getParentId3() {
        return parentId3;
    }

    public void setParentId3(String parentId3) {
        this.parentId3 = parentId3;
    }

    public String getParentId4() {
        return parentId4;
    }

    public void setParentId4(String parentId4) {
        this.parentId4 = parentId4;
    }

    public String getParentId5() {
        return parentId5;
    }

    public void setParentId5(String parentId5) {
        this.parentId5 = parentId5;
    }

    public String getParentId6() {
        return parentId6;
    }

    public void setParentId6(String parentId6) {
        this.parentId6 = parentId6;
    }

    public String getParentId7() {
        return parentId7;
    }

    public void setParentId7(String parentId7) {
        this.parentId7 = parentId7;
    }

    public String getParentId8() {
        return parentId8;
    }

    public void setParentId8(String parentId8) {
        this.parentId8 = parentId8;
    }

    public String getParentId9() {
        return parentId9;
    }

    public void setParentId9(String parentId9) {
        this.parentId9 = parentId9;
    }

    public String getParentId10() {
        return parentId10;
    }

    public void setParentId10(String parentId10) {
        this.parentId10 = parentId10;
    }

    public String getDataUserId() {
        return dataUserId;
    }

    public void setDataUserId(String dataUserId) {
        this.dataUserId = dataUserId;
    }

    public String getDataOfficeId() {
        return dataOfficeId;
    }

    public void setDataOfficeId(String dataOfficeId) {
        this.dataOfficeId = dataOfficeId;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataAreaId() {
        return dataAreaId;
    }

    public void setDataAreaId(String dataAreaId) {
        this.dataAreaId = dataAreaId;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}