package com.feihua.framework.base.impl;

import com.feihua.exception.BaseException;
import com.feihua.exception.DataConflictException;
import com.feihua.framework.base.modules.datascope.api.ApiBaseDataScopeService;
import com.feihua.framework.constants.DictEnum;
import com.feihua.framework.base.modules.rel.api.ApiBaseRoleDataScopeRelPoService;
import com.feihua.framework.base.modules.rel.api.ApiBaseUserDataScopeRelPoService;
import com.feihua.framework.base.modules.rel.dto.BaseRoleDataScopeRelDto;
import com.feihua.framework.base.modules.rel.dto.BaseUserDataScopeRelDto;
import com.feihua.framework.base.modules.user.api.ApiBaseUserDataScopeDefinePoService;
import com.feihua.framework.base.modules.user.dto.BaseUserDataScopeDefineDto;
import com.feihua.framework.base.modules.user.dto.BaseUserDataScopeDefineParamDto;
import com.feihua.framework.base.modules.user.po.BaseUserDataScopeDefinePo;
import feihua.jdbc.api.pojo.BasePo;
import feihua.jdbc.api.service.impl.ApiBaseServiceImpl;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated by MyBatis Generator.
 * @author yangwei 2018-03-19 11:19:20
 */
@Service
public class ApiBaseUserDataScopeDefinePoServiceImpl extends ApiBaseServiceImpl<BaseUserDataScopeDefinePo, BaseUserDataScopeDefineDto, String> implements ApiBaseUserDataScopeDefinePoService ,ApiBaseDataScopeService<BaseUserDataScopeDefineDto> {

    public ApiBaseUserDataScopeDefinePoServiceImpl() {
        super(BaseUserDataScopeDefineDto.class);
    }

    @Autowired
    private ApiBaseUserDataScopeRelPoService apiBaseUserDataScopeRelPoService;
    @Autowired
    private ApiBaseRoleDataScopeRelPoService apiBaseRoleDataScopeRelPoService;
    @Autowired
    private DataScopeConflictService dataScopeConflictService;

    @Transactional(rollbackFor = Exception.class,readOnly = false)
    @Override
    public BaseUserDataScopeDefineDto setUserDataScopeDefine(BaseUserDataScopeDefineParamDto userDataScopeDefineParamDto) {
        BaseUserDataScopeDefinePo userDataScopeDefineCondition = new BaseUserDataScopeDefinePo();
        userDataScopeDefineCondition.setDataScopeId(userDataScopeDefineParamDto.getDataScopeId());
        userDataScopeDefineCondition.setDelFlag(BasePo.YesNo.N.name());
        BaseUserDataScopeDefineDto result = null;
        // 查询是否存在
        BaseUserDataScopeDefinePo userDataScopeDefinePo = this.selectOneSimple(userDataScopeDefineCondition);
        // 如果不存在，添加一条新的设置
        if (userDataScopeDefinePo == null) {
            BaseUserDataScopeDefinePo insertUserDataScopeDefinePo = new BaseUserDataScopeDefinePo();
            insertUserDataScopeDefinePo.setDataScopeId(userDataScopeDefineParamDto.getDataScopeId());
            insertUserDataScopeDefinePo.setType(userDataScopeDefineParamDto.getType());
            insertUserDataScopeDefinePo = this.preInsert(insertUserDataScopeDefinePo,userDataScopeDefineParamDto.getCurrentUserId());

            result = this.insert(insertUserDataScopeDefinePo);

            return result;
        }else{
            // 如果已经存在，更新
            userDataScopeDefinePo.setType(userDataScopeDefineParamDto.getType());
            userDataScopeDefinePo = this.preUpdate(userDataScopeDefinePo,userDataScopeDefineParamDto.getCurrentUserId());
            // 这里没有考虑乐观锁
            int r = this.updateByPrimaryKey(userDataScopeDefinePo);
            if(r == 1){
                dataScopeConflictService.checkConflict(userDataScopeDefinePo.getDataScopeId(),this);
                result = this.wrapDto(userDataScopeDefinePo);

                return result;
            }else{
                return null;
            }

        }

    }
    @Transactional( propagation = Propagation.SUPPORTS, readOnly = true )
    @Override
    public BaseUserDataScopeDefineDto selectByDataScopeId(String dataScopeId) {
        BaseUserDataScopeDefinePo userDataScopeDefinePo = new BaseUserDataScopeDefinePo();
        userDataScopeDefinePo.setDataScopeId(dataScopeId);
        userDataScopeDefinePo.setDelFlag(BasePo.YesNo.N.name());
        return this.selectOne(userDataScopeDefinePo);
    }
    @Transactional( propagation = Propagation.SUPPORTS, readOnly = true )
    @Override
    public BaseUserDataScopeDefineDto selectDataScopeDefineByUserId(String userId, String roleId) {
        List<BaseUserDataScopeRelDto> userDataScopeRelDtos = apiBaseUserDataScopeRelPoService.selectByUserId(userId);
        // 用户设置了数据范围，以该数据范围优先
        if(CollectionUtils.isNotEmpty(userDataScopeRelDtos)){
            for (BaseUserDataScopeRelDto userDataScopeRelDto : userDataScopeRelDtos) {
                BaseUserDataScopeDefineDto defineDto = this.selectByDataScopeId(userDataScopeRelDto.getDataScopeId());
                // 如果一个用户设置了多个数据范围，以有权限的数据范围优先
                if(defineDto != null && !DictEnum.UserDataScope.no.name().equals(defineDto.getType())){
                    return defineDto;
                }
            }

        }
        // 取角色设置的数据范围
        else{
            List<BaseRoleDataScopeRelDto> roleDataScopeRelDtos = apiBaseRoleDataScopeRelPoService.selectByRoleId(roleId);
            if(CollectionUtils.isNotEmpty(roleDataScopeRelDtos)){
                for (BaseRoleDataScopeRelDto roleDataScopeRelDto : roleDataScopeRelDtos) {
                    BaseUserDataScopeDefineDto defineDto = this.selectByDataScopeId(roleDataScopeRelDto.getDataScopeId());
                    // 如果一个角色设置了多个数据范围，以有权限的数据范围优先
                    if(defineDto != null && !DictEnum.UserDataScope.no.name().equals(defineDto.getType())){
                        return defineDto;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public boolean isAllData(BaseUserDataScopeDefineDto dataScopeDefine) {
        if (dataScopeDefine != null && DictEnum.UserDataScope.all.name().equals(dataScopeDefine.getType())) {
            return true;
        }
        return false;
    }
    @Transactional( propagation = Propagation.SUPPORTS, readOnly = true )
    @Override
    public void checkConflict(List<String> dataScopeIds) throws BaseException {
        if(CollectionUtils.isNotEmpty(dataScopeIds)){
            List<BaseUserDataScopeDefineDto> list = new ArrayList<>();
            for (String dataScopeId : dataScopeIds) {
                BaseUserDataScopeDefineDto definePo = this.selectByDataScopeId(dataScopeId);
                if(definePo != null && !DictEnum.DictDataScope.no.name().equals(definePo.getType())){
                    list.add(definePo);
                }
            }
            if(CollectionUtils.isNotEmpty(list)){
                throw new DataConflictException("dict dataScope conflict!",DictEnum.DataResource.dict.name());
            }
        }
    }

    @Override
    public BaseUserDataScopeDefineDto wrapDto(BaseUserDataScopeDefinePo po) {
        if (po == null) {
            return null;
        }
        BaseUserDataScopeDefineDto userDataScopeDefineDto = new BaseUserDataScopeDefineDto();
        userDataScopeDefineDto.setDataScopeId(po.getDataScopeId());
        userDataScopeDefineDto.setDataOfficeId(po.getDataOfficeId());
        userDataScopeDefineDto.setDataUserId(po.getDataUserId());
        userDataScopeDefineDto.setId(po.getId());
        userDataScopeDefineDto.setDataAreaId(po.getDataAreaId());
        userDataScopeDefineDto.setUpdateAt(po.getUpdateAt());
        userDataScopeDefineDto.setType(po.getType());
        userDataScopeDefineDto.setDataType(po.getDataType());
        return userDataScopeDefineDto;
    }
}