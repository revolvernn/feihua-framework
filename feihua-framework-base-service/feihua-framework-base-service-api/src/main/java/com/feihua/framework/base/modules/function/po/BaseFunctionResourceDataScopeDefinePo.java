package com.feihua.framework.base.modules.function.po;

import feihua.jdbc.api.pojo.BasePo;

/**
 * This class was generated by MyBatis Generator.
 * @author yangwei 2018-03-19 14:24:58
 *
 * This class corresponds to the database table base_function_resource_data_scope_define
 * @mbg.generated do_not_delete_during_merge 2018-03-19 14:24:58
*/
public class BaseFunctionResourceDataScopeDefinePo extends feihua.jdbc.api.pojo.BasePo<String> {
    /**
     * Database Column Remarks:
     *   角色id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_function_resource_data_scope_define.ROLE_ID
     *
     * @mbg.generated 2018-03-19 14:24:58
     */
    private String roleId;

    /**
     * Database Column Remarks:
     *   功能数据范围类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_function_resource_data_scope_define.TYPE
     *
     * @mbg.generated 2018-03-19 14:24:58
     */
    private String type;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public com.feihua.framework.base.modules.function.api.ApiBaseFunctionResourceDataScopeDefinePoService service() {
        return com.feihua.utils.spring.SpringContextHolder.getBean(com.feihua.framework.base.modules.function.api.ApiBaseFunctionResourceDataScopeDefinePoService.class);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", type=").append(type);
        sb.append("]");
        return sb.toString();
    }
}