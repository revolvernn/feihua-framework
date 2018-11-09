package com.feihua.framework.cms.po;

import feihua.jdbc.api.pojo.BasePo;

/**
 * This class was generated by MyBatis Generator.
 * @author yangwei 2018-11-09 16:15:06
 *
 * This class corresponds to the database table cms_site
 * @mbg.generated do_not_delete_during_merge 2018-11-09 16:15:06
*/
public class CmsSitePo extends feihua.jdbc.api.pojo.BasePo<String> {
    /**
     * Database Column Remarks:
     *   名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_site.NAME
     *
     * @mbg.generated 2018-11-09 16:15:06
     */
    private String name;

    /**
     * Database Column Remarks:
     *   域名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_site.DOMAIN
     *
     * @mbg.generated 2018-11-09 16:15:06
     */
    private String domain;

    /**
     * Database Column Remarks:
     *   路径，各站点资源的存放路径
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_site.PATH
     *
     * @mbg.generated 2018-11-09 16:15:06
     */
    private String path;

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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public com.feihua.framework.cms.api.ApiCmsSitePoService service() {
        return com.feihua.utils.spring.SpringContextHolder.getBean(com.feihua.framework.cms.api.ApiCmsSitePoService.class);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", domain=").append(domain);
        sb.append(", path=").append(path);
        sb.append("]");
        return sb.toString();
    }
}