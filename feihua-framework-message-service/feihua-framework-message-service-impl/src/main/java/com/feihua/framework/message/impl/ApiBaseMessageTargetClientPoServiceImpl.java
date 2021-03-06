package com.feihua.framework.message.impl;

import com.feihua.framework.constants.DictEnum;
import com.feihua.framework.message.api.ApiBaseMessageTargetClientPoService;
import com.feihua.framework.message.dto.BaseMessageTargetClientDto;
import com.feihua.framework.message.dto.BaseMessageTargetClientParamsDto;
import com.feihua.framework.message.mapper.BaseMessageTargetClientPoMapper;
import com.feihua.framework.message.po.BaseMessageTargetClientPo;
import feihua.jdbc.api.pojo.BasePo;
import feihua.jdbc.api.service.impl.ApiBaseServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This class was generated by MyBatis Generator.
 * @author yangwei 2018-10-31 12:43:49
 */
@Service
public class ApiBaseMessageTargetClientPoServiceImpl extends ApiBaseServiceImpl<BaseMessageTargetClientPo, BaseMessageTargetClientDto, String> implements ApiBaseMessageTargetClientPoService {
    @Autowired
    private BaseMessageTargetClientPoMapper baseMessageTargetClientPoMapper;

    public ApiBaseMessageTargetClientPoServiceImpl() {
        super(BaseMessageTargetClientDto.class);
    }

    @Override
    public BaseMessageTargetClientDto wrapDto(BaseMessageTargetClientPo po) {
        if (po == null) {
            return null;
        }

        BaseMessageTargetClientDto baseMessageTargetClientDto = new BaseMessageTargetClientDto();
        baseMessageTargetClientDto.setMessageId(po.getMessageId());
        baseMessageTargetClientDto.setTargetClient(po.getTargetClient());
        baseMessageTargetClientDto.setUpdateAt(po.getUpdateAt());
        baseMessageTargetClientDto.setId(po.getId());
        baseMessageTargetClientDto.setDataOfficeId(po.getDataOfficeId());
        baseMessageTargetClientDto.setDataUserId(po.getDataUserId());
        baseMessageTargetClientDto.setDataType(po.getDataType());
        baseMessageTargetClientDto.setDataAreaId(po.getDataAreaId());
        baseMessageTargetClientDto.setSubTargetClient(po.getSubTargetClient());
        return baseMessageTargetClientDto;
    }

    @Override
    public List<BaseMessageTargetClientPo> selectByMessageId(String messageId, DictEnum.MessageState messageState) {
        BaseMessageTargetClientPo baseMessageTargetClientPo = new BaseMessageTargetClientPo();
        baseMessageTargetClientPo.setMessageId(messageId);
        baseMessageTargetClientPo.setDelFlag(BasePo.YesNo.N.name());
        if (messageState != null) {
            baseMessageTargetClientPo.setMessageState(messageState.name());
        }
        return this.selectListSimple(baseMessageTargetClientPo);
    }

    @Override
    public List<BaseMessageTargetClientPo> selectByTargetClient(BaseMessageTargetClientParamsDto clientParamsDto, DictEnum.MessageState messageState) {
        if (StringUtils.isNotEmpty(clientParamsDto.getTargetClient())){
            BaseMessageTargetClientPo baseMessageTargetClientPo = new BaseMessageTargetClientPo();
            baseMessageTargetClientPo.setMessageState(messageState.name());
            baseMessageTargetClientPo.setTargetClient(clientParamsDto.getTargetClient());
            baseMessageTargetClientPo.setSubTargetClient(clientParamsDto.getSubTargetClient());
            baseMessageTargetClientPo.setDelFlag(BasePo.YesNo.N.name());
            return this.selectListSimple(baseMessageTargetClientPo);
        }
        return null;
    }

    @Override
    public BaseMessageTargetClientPo selectByMessageIdAndTargetClient(String messageId,BaseMessageTargetClientParamsDto  clientParamsDto,DictEnum.MessageState messageState) {

        if(StringUtils.isEmpty(messageId) || clientParamsDto == null || StringUtils.isEmpty(clientParamsDto.getTargetClient())) return null;

        BaseMessageTargetClientPo baseMessageTargetClientPo = new BaseMessageTargetClientPo();
        baseMessageTargetClientPo.setMessageState(messageState.name());
        baseMessageTargetClientPo.setTargetClient(clientParamsDto.getTargetClient());
        baseMessageTargetClientPo.setSubTargetClient(clientParamsDto.getSubTargetClient());
        baseMessageTargetClientPo.setMessageId(messageId);
        baseMessageTargetClientPo.setDelFlag(BasePo.YesNo.N.name());
        baseMessageTargetClientPo = this.selectOneSimple(baseMessageTargetClientPo);
        return baseMessageTargetClientPo;
    }
}