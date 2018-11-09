package com.feihua.framework.message.impl;

import com.feihua.framework.message.api.ApiBaseMessageTargetClientUserRelPoService;
import com.feihua.framework.message.dto.BaseMessageTargetClientUserRelDto;
import com.feihua.framework.message.po.BaseMessageTargetClientUserRelPo;
import feihua.jdbc.api.pojo.BasePo;
import feihua.jdbc.api.service.impl.ApiBaseServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class was generated by MyBatis Generator.
 * @author yangwei 2018-11-02 17:25:55
 */
@Service
public class ApiBaseMessageTargetClientUserRelPoServiceImpl extends ApiBaseServiceImpl<BaseMessageTargetClientUserRelPo, BaseMessageTargetClientUserRelDto, String> implements ApiBaseMessageTargetClientUserRelPoService {
    @Autowired
    com.feihua.framework.message.mapper.BaseMessageTargetClientUserRelPoMapper BaseMessageTargetClientUserRelPoMapper;

    public ApiBaseMessageTargetClientUserRelPoServiceImpl() {
        super(BaseMessageTargetClientUserRelDto.class);
    }

    @Override
    public BaseMessageTargetClientUserRelDto wrapDto(BaseMessageTargetClientUserRelPo po) {
        if (po == null) {
            return null;
        }
        BaseMessageTargetClientUserRelDto baseMessageTargetClientUserRelDto = new BaseMessageTargetClientUserRelDto();
        baseMessageTargetClientUserRelDto.setId(po.getId());
        baseMessageTargetClientUserRelDto.setTargetClientId(po.getTargetClientId());
        baseMessageTargetClientUserRelDto.setUserId(po.getUserId());
        baseMessageTargetClientUserRelDto.setIsRead(po.getIsRead());

        baseMessageTargetClientUserRelDto.setUpdateAt(po.getUpdateAt());
        baseMessageTargetClientUserRelDto.setDataOfficeId(po.getDataOfficeId());
        baseMessageTargetClientUserRelDto.setDataUserId(po.getDataUserId());
        baseMessageTargetClientUserRelDto.setDataType(po.getDataType());
        baseMessageTargetClientUserRelDto.setDataAreaId(po.getDataAreaId());
        return baseMessageTargetClientUserRelDto;
    }

    @Override
    public BaseMessageTargetClientUserRelPo selectByClientIdAndUserId(String targetClientId, String userId,String isRead) {
        if (StringUtils.isEmpty(targetClientId) ||  StringUtils.isEmpty(userId)){
            return null;
        }
        BaseMessageTargetClientUserRelPo baseMessageTargetClientUserRelPo = new BaseMessageTargetClientUserRelPo();
        baseMessageTargetClientUserRelPo.setTargetClientId(targetClientId);
        baseMessageTargetClientUserRelPo.setUserId(userId);
        baseMessageTargetClientUserRelPo.setDelFlag(BasePo.YesNo.N.name());
        baseMessageTargetClientUserRelPo.setIsRead(isRead);
        baseMessageTargetClientUserRelPo = this.selectOneSimple(baseMessageTargetClientUserRelPo);

        return baseMessageTargetClientUserRelPo;
    }
}