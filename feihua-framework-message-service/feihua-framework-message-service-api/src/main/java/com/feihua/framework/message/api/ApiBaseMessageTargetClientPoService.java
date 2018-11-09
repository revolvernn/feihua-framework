package com.feihua.framework.message.api;

import com.feihua.framework.constants.DictEnum;
import com.feihua.framework.message.dto.BaseMessageTargetClientDto;
import com.feihua.framework.message.dto.BaseMessageTargetClientParamsDto;
import com.feihua.framework.message.po.BaseMessageTargetClientPo;

import java.util.List;

/**
 * This class was generated by MyBatis Generator.
 * @author yangwei 2018-10-31 12:43:49
 */
public interface ApiBaseMessageTargetClientPoService extends feihua.jdbc.api.service.ApiBaseService<BaseMessageTargetClientPo, BaseMessageTargetClientDto, String> {

    /**
     * 根据消息id查询
     * @param messageId
     * @return
     */
    public List<BaseMessageTargetClientPo> selectByMessageId(String messageId, DictEnum.MessageState messageState);

    /**
     * 根据消息目标客户端查询
     * @param clientParamsDto
     * @return
     */
    public List<BaseMessageTargetClientPo> selectByTargetClient(BaseMessageTargetClientParamsDto  clientParamsDto, DictEnum.MessageState messageState);

    BaseMessageTargetClientPo selectByMessageIdAndTargetClient(String messageId,BaseMessageTargetClientParamsDto  clientParamsDto,DictEnum.MessageState messageState);
}