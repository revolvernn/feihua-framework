package com.feihua.framework.message.api;

import com.feihua.framework.message.dto.BaseMessageTargetClientUserRelDto;
import com.feihua.framework.message.po.BaseMessageTargetClientUserRelPo;

/**
 * This class was generated by MyBatis Generator.
 * @author yangwei 2018-11-02 17:25:55
 */
public interface ApiBaseMessageTargetClientUserRelPoService extends feihua.jdbc.api.service.ApiBaseService<BaseMessageTargetClientUserRelPo, BaseMessageTargetClientUserRelDto, String> {


    /**
     * 根据客户端id和用户id查询，应该是一条数据才对
     * @param targetClientId
     * @param userId
     * @param isRead
     * @return
     */
    BaseMessageTargetClientUserRelPo selectByClientIdAndUserId(String targetClientId,String userId,String isRead);

}