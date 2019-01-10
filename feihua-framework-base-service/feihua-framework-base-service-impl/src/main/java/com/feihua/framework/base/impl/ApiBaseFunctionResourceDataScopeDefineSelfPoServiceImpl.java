package com.feihua.framework.base.impl;

import com.feihua.framework.base.modules.function.api.ApiBaseFunctionResourceDataScopeDefineSelfPoService;
import com.feihua.framework.base.modules.function.dto.BaseFunctionResourceDataScopeDefineSelfDto;
import com.feihua.framework.base.modules.function.po.BaseFunctionResourceDataScopeDefineSelfPo;
import feihua.jdbc.api.pojo.BasePo;
import feihua.jdbc.api.service.impl.ApiBaseServiceImpl;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated by MyBatis Generator.
 * @author yangwei 2018-03-19 14:24:58
 */
@Service
public class ApiBaseFunctionResourceDataScopeDefineSelfPoServiceImpl extends ApiBaseServiceImpl<BaseFunctionResourceDataScopeDefineSelfPo, BaseFunctionResourceDataScopeDefineSelfDto, String> implements ApiBaseFunctionResourceDataScopeDefineSelfPoService {

    public ApiBaseFunctionResourceDataScopeDefineSelfPoServiceImpl() {
        super(BaseFunctionResourceDataScopeDefineSelfDto.class);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int insertFunctionResourceSelf(List<String> functionResourceIds, String functionResourceDataScopeDefineId, String currentUserId) {
        int r = 0;
        if(CollectionUtils.isNotEmpty(functionResourceIds)){
            List<BaseFunctionResourceDataScopeDefineSelfPo> preInsertList = new ArrayList<>(functionResourceIds.size());
            for (String functionResourceId : functionResourceIds) {
                // 自定义
                BaseFunctionResourceDataScopeDefineSelfPo baseCommonDataScopeDefineOfficeSelfPo = new BaseFunctionResourceDataScopeDefineSelfPo();
                baseCommonDataScopeDefineOfficeSelfPo.setFunctionResourceDataScopeDefineId(functionResourceDataScopeDefineId);
                baseCommonDataScopeDefineOfficeSelfPo.setFunctionResourceId(functionResourceId);
                baseCommonDataScopeDefineOfficeSelfPo = this.preInsert(baseCommonDataScopeDefineOfficeSelfPo,currentUserId);
                preInsertList.add(baseCommonDataScopeDefineOfficeSelfPo);
            }
            // 批量插入
            r = this.insertBatch(preInsertList);
        }
        return r;
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public int deleteFunctionResourceSelfByFunctionResourceDataScopeDefineId(String functionResourceDataScopeDefineId, String currentUserId) {
        //先删除掉以前的配置
        BaseFunctionResourceDataScopeDefineSelfPo deleteCondition = new BaseFunctionResourceDataScopeDefineSelfPo();
        deleteCondition.setFunctionResourceDataScopeDefineId(functionResourceDataScopeDefineId);
        int r = this.deleteFlagSelectiveWithUpdateUser(deleteCondition,currentUserId);

        return r;
    }

    @Override
    public List<BaseFunctionResourceDataScopeDefineSelfDto> selectByFunctionResourceDataScopeDefineId(String functionResourceDataScopeDefineId) {
        BaseFunctionResourceDataScopeDefineSelfPo condition = new BaseFunctionResourceDataScopeDefineSelfPo();
        condition.setFunctionResourceDataScopeDefineId(functionResourceDataScopeDefineId);
        condition.setDelFlag(BasePo.YesNo.N.name());
        return this.selectList(condition);
    }

    @Override
    public BaseFunctionResourceDataScopeDefineSelfDto wrapDto(BaseFunctionResourceDataScopeDefineSelfPo po) {
        if (po == null) {
            return null;
        }
        BaseFunctionResourceDataScopeDefineSelfDto baseFunctionResourceDataScopeDefineSelfDto = new BaseFunctionResourceDataScopeDefineSelfDto();
        baseFunctionResourceDataScopeDefineSelfDto.setFunctionResourceId(po.getFunctionResourceId());
        baseFunctionResourceDataScopeDefineSelfDto.setDataOfficeId(po.getDataOfficeId());
        baseFunctionResourceDataScopeDefineSelfDto.setFunctionResourceDataScopeDefineId(po.getFunctionResourceDataScopeDefineId());
        baseFunctionResourceDataScopeDefineSelfDto.setDataType(po.getDataType());
        baseFunctionResourceDataScopeDefineSelfDto.setDataUserId(po.getDataUserId());
        baseFunctionResourceDataScopeDefineSelfDto.setUpdateAt(po.getUpdateAt());
        baseFunctionResourceDataScopeDefineSelfDto.setDataAreaId(po.getDataAreaId());
        baseFunctionResourceDataScopeDefineSelfDto.setId(po.getId());
        return baseFunctionResourceDataScopeDefineSelfDto;
    }
}