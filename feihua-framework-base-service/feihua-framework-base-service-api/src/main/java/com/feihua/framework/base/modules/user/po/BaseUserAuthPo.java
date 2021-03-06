package com.feihua.framework.base.modules.user.po;

import feihua.jdbc.api.pojo.BasePo;
import java.util.Date;

/**
 * This class was generated by MyBatis Generator.
 * @author yangwei 2018-04-19 15:34:23
 *
 * This class corresponds to the database table base_user_auth
 * @mbg.generated do_not_delete_during_merge 2018-04-19 15:34:23
*/
public class BaseUserAuthPo extends feihua.jdbc.api.pojo.BasePo<String> {
    /**
     * Database Column Remarks:
     *   用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user_auth.USER_ID
     *
     * @mbg.generated 2018-04-19 15:34:24
     */
    private String userId;

    /**
     * Database Column Remarks:
     *   登录标识
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user_auth.IDENTIFIER
     *
     * @mbg.generated 2018-04-19 15:34:24
     */
    private String identifier;

    /**
     * Database Column Remarks:
     *   密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user_auth.CREDENTIAL
     *
     * @mbg.generated 2018-04-19 15:34:24
     */
    private String credential;

    /**
     * Database Column Remarks:
     *   授权类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user_auth.IDENTITY_TYPE
     *
     * @mbg.generated 2018-04-19 15:34:24
     */
    private String identityType;

    /**
     * Database Column Remarks:
     *   是否已验证，Y=是，N=否
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user_auth.VERIFIED
     *
     * @mbg.generated 2018-04-19 15:34:24
     */
    private String verified;

    /**
     * Database Column Remarks:
     *   最后登录时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user_auth.LAST_TIME
     *
     * @mbg.generated 2018-04-19 15:34:24
     */
    private Date lastTime;

    /**
     * Database Column Remarks:
     *   最后登录ip
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user_auth.LAST_IP
     *
     * @mbg.generated 2018-04-19 15:34:24
     */
    private String lastIp;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getVerified() {
        return verified;
    }

    public void setVerified(String verified) {
        this.verified = verified;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public com.feihua.framework.base.modules.user.api.ApiBaseUserAuthPoService service() {
        return com.feihua.utils.spring.SpringContextHolder.getBean(com.feihua.framework.base.modules.user.api.ApiBaseUserAuthPoService.class);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", identifier=").append(identifier);
        sb.append(", credential=").append(credential);
        sb.append(", identityType=").append(identityType);
        sb.append(", verified=").append(verified);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", lastIp=").append(lastIp);
        sb.append("]");
        return sb.toString();
    }
}