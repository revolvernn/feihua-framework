package com.feihua.framework.base.impl;

import com.feihua.framework.base.modules.datascope.api.ApiBaseDataScopePoService;
import com.feihua.framework.base.modules.datascope.api.ApiBaseDataScopeService;
import com.feihua.framework.base.modules.datascope.dto.BaseDataScopeDataScopeDefineDto;
import com.feihua.framework.base.modules.datascope.dto.BaseDataScopeDto;
import com.feihua.framework.base.modules.datascope.dto.SearchDataScopesConditionDsfDto;
import com.feihua.framework.base.modules.datascope.dto.SearchDataScopesConditionDto;
import com.feihua.framework.base.mapper.BaseDataScopePoMapper;
import com.feihua.framework.base.modules.datascope.po.BaseDataScopePo;
import com.feihua.framework.constants.DictEnum;
import com.feihua.framework.base.modules.office.api.ApiBaseOfficePoService;
import com.feihua.framework.base.modules.office.dto.BaseOfficeDataScopeDefineDto;
import com.feihua.framework.base.modules.office.dto.BaseOfficeDto;
import com.feihua.framework.base.modules.office.dto.SearchOfficesConditionDto;
import com.feihua.framework.base.modules.office.po.BaseOfficePo;
import com.feihua.framework.base.modules.user.dto.BaseUserDto;
import com.github.pagehelper.Page;
import feihua.jdbc.api.pojo.PageAndOrderbyParamDto;
import feihua.jdbc.api.pojo.PageResultDto;
import feihua.jdbc.api.service.impl.ApiBaseServiceImpl;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated by MyBatis Generator.
 * @author yangwei 2018-01-09 13:35:54
 */
@Service
public class ApiBaseDataScopePoServiceImpl extends ApiBaseServiceImpl<BaseDataScopePo, BaseDataScopeDto, String> implements ApiBaseDataScopePoService {

    public ApiBaseDataScopePoServiceImpl() {
        super(BaseDataScopeDto.class);
    }

    @Autowired
    private ApiBaseDataScopeService<BaseDataScopeDataScopeDefineDto> ApiBaseDataScopeDataScopeService;
    @Autowired
    private ApiBaseOfficePoService apiBaseOfficePoService;
    @Autowired
    private ApiBaseDataScopeService<BaseOfficeDataScopeDefineDto> apiBaseOfficeDataScopeService;


    @Autowired
    private BaseDataScopePoMapper baseDataScopePoMapper;
    @Transactional( propagation = Propagation.SUPPORTS, readOnly = true )
    @Override
    public PageResultDto<BaseDataScopeDto> searchDataScopesDsf(SearchDataScopesConditionDto conditionDto, PageAndOrderbyParamDto pageAndOrderbyParamDto) {

        BaseDataScopeDataScopeDefineDto defineDto = ApiBaseDataScopeDataScopeService.selectDataScopeDefineByUserId(conditionDto.getCurrentUserId(),conditionDto.getCurrentRoleId());
        // 如果没有定义，或定义的为无权限，直接返回空
        if (defineDto == null || StringUtils.isEmpty(conditionDto.getType()) || DictEnum.DataScopeDataScope.no.name().equals(conditionDto.getType())) {
            new PageResultDto();
        }
        SearchDataScopesConditionDsfDto searchDataScopesConditionDsfDto = new SearchDataScopesConditionDsfDto();
        searchDataScopesConditionDsfDto.setType(conditionDto.getType());
        searchDataScopesConditionDsfDto.setName(conditionDto.getName());

        // 如果定义的是所有数据
        if(DictEnum.DataScopeDataScope.all.name().equals(defineDto.getType())){

            Page p = super.pageAndOrderbyStart(pageAndOrderbyParamDto);
            List<BaseDataScopeDto> list = this.wrapDtos(baseDataScopePoMapper.searchDataScopes(searchDataScopesConditionDsfDto));
            return new PageResultDto(list, this.wrapPage(p));
        }
        // 公共的都显示
        String publicTypeCondition = " type = '"+ DictEnum.DataScopeType.publicType.name() +"' ";
        // 用户所在机构下的数据范围
        if(DictEnum.DataScopeDataScope.useroffice.name().equals(defineDto.getType())){
            BaseOfficeDto officeDto = apiBaseOfficePoService.selectOfficeByUserId(conditionDto.getCurrentUserId());
            // 如果机构不存在，直接返回空
            if(officeDto == null){
                return new PageResultDto(null, null);
            }

            StringBuffer sb = new StringBuffer();
            sb.append(" and data_office_id = '").append(officeDto.getId()).append("'");
            sb.append(" or ").append(publicTypeCondition);
            Page p = super.pageAndOrderbyStart(pageAndOrderbyParamDto);
            searchDataScopesConditionDsfDto.setSelfCondition(sb.toString());
            List<BaseDataScopeDto> list = this.wrapDtos(baseDataScopePoMapper.searchDataScopes(searchDataScopesConditionDsfDto));
            return new PageResultDto(list, this.wrapPage(p));
        }
        // 用户所在机构及以下机构数据范围
        if(DictEnum.DataScopeDataScope.userofficedown.name().equals(defineDto.getType())){
            BaseOfficeDto officeDto = apiBaseOfficePoService.selectOfficeByUserId(conditionDto.getCurrentUserId());
            if (officeDto == null) {
                return new PageResultDto();
            }

            List<BaseOfficePo> officePoList = new ArrayList<>();
            officePoList.add(apiBaseOfficePoService.selectByPrimaryKeySimple(officeDto.getId(),false));
            // 查询子机构

            List<BaseOfficePo> officePos = apiBaseOfficePoService.getChildrenAll(officeDto.getId());
            if(CollectionUtils.isNotEmpty(officePos)){
                officePoList.addAll(officePos);
            }
            if(CollectionUtils.isEmpty(officePoList)){
                return new PageResultDto();
            }
            // 机构查询完，根据机构id查询角色

            StringBuffer sb = new StringBuffer("and (1!=1 ");
            for (BaseOfficePo officePo : officePoList) {
                sb.append(" or data_office_id = '").append(officePo.getId()).append("'");
            }
            sb.append(")");
            sb.append(" or ").append(publicTypeCondition);

            Page p = super.pageAndOrderbyStart(pageAndOrderbyParamDto);
            searchDataScopesConditionDsfDto.setSelfCondition(sb.toString());
            List<BaseDataScopeDto> list = this.wrapDtos(baseDataScopePoMapper.searchDataScopes(searchDataScopesConditionDsfDto));
            return new PageResultDto(list, this.wrapPage(p));
        }
        // 角色所在机构下的数据范围
        if(DictEnum.DataScopeDataScope.roleoffice.name().equals(defineDto.getType())){
            BaseOfficeDto officeDto = apiBaseOfficePoService.selectOfficeByUserId(conditionDto.getCurrentRoleId());
            // 如果机构不存在，直接返回空
            if(officeDto == null){
                return new PageResultDto(null, null);
            }

            StringBuffer sb = new StringBuffer();
            sb.append(" and data_office_id = '").append(officeDto.getId()).append("'");
            sb.append(" or ").append(publicTypeCondition);
            Page p = super.pageAndOrderbyStart(pageAndOrderbyParamDto);
            searchDataScopesConditionDsfDto.setSelfCondition(sb.toString());
            List<BaseDataScopeDto> list = this.wrapDtos(baseDataScopePoMapper.searchDataScopes(searchDataScopesConditionDsfDto));
            return new PageResultDto(list, this.wrapPage(p));
        }
        // 角色所在机构及以下机构数据范围
        if(DictEnum.DataScopeDataScope.userofficedown.name().equals(defineDto.getType())){
            BaseOfficeDto officeDto = apiBaseOfficePoService.selectOfficeByUserId(conditionDto.getCurrentRoleId());
            if (officeDto == null) {
                return new PageResultDto();
            }

            List<BaseOfficePo> officePoList = new ArrayList<>();
            officePoList.add(apiBaseOfficePoService.selectByPrimaryKeySimple(officeDto.getId(),false));
            // 查询子机构

            List<BaseOfficePo> officePos = apiBaseOfficePoService.getChildrenAll(officeDto.getId());
            if(CollectionUtils.isNotEmpty(officePos)){
                officePoList.addAll(officePos);
            }
            if(CollectionUtils.isEmpty(officePoList)){
                return new PageResultDto();
            }
            // 机构查询完，根据机构id查询角色

            StringBuffer sb = new StringBuffer("and (1!=1 ");
            for (BaseOfficePo officePo : officePoList) {
                sb.append(" or data_office_id = '").append(officePo.getId()).append("'");
            }
            sb.append(")");
            sb.append(" or ").append(publicTypeCondition);

            Page p = super.pageAndOrderbyStart(pageAndOrderbyParamDto);
            searchDataScopesConditionDsfDto.setSelfCondition(sb.toString());
            List<BaseDataScopeDto> list = this.wrapDtos(baseDataScopePoMapper.searchDataScopes(searchDataScopesConditionDsfDto));
            return new PageResultDto(list, this.wrapPage(p));
        }
        // 机构数据范围下的数据范围
        if(DictEnum.DataScopeDataScope.office.name().equals(defineDto.getType())){
            // 判断机构是否设置的所有数据
            boolean isOfficeAllData = apiBaseOfficeDataScopeService.isAllData(apiBaseOfficeDataScopeService.selectDataScopeDefineByUserId(conditionDto.getCurrentUserId(),conditionDto.getCurrentRoleId()));
            if (isOfficeAllData) {
                Page p = super.pageAndOrderbyStart(pageAndOrderbyParamDto);
                List<BaseDataScopeDto> list = this.wrapDtos(baseDataScopePoMapper.searchDataScopes(searchDataScopesConditionDsfDto));
                return new PageResultDto(list, this.wrapPage(p));
            }

            PageResultDto<BaseOfficeDto> offices = apiBaseOfficePoService.searchOfficesDsf(new SearchOfficesConditionDto(),null);
            if(offices == null || CollectionUtils.isEmpty(offices.getData())){
                return new PageResultDto();
            }
            // 根据机构id查询用户
            StringBuffer sb = new StringBuffer("and (1!=1 ");
            for (BaseOfficeDto officeDto : offices.getData()) {
                sb.append(" or user_account_po.data_office_id = '").append(officeDto.getId()).append("'");
            }
            sb.append(")");
            sb.append(" or ").append(publicTypeCondition);

            Page p = super.pageAndOrderbyStart(pageAndOrderbyParamDto);
            searchDataScopesConditionDsfDto.setSelfCondition(sb.toString());
            List<BaseDataScopeDto> list = this.wrapDtos(baseDataScopePoMapper.searchDataScopes(searchDataScopesConditionDsfDto));
            return new PageResultDto(list, this.wrapPage(p));
        }
        return new PageResultDto();
    }

    @Override
    public BaseDataScopeDto wrapDto(BaseDataScopePo po) {
        if (po == null) {
            return null;
        }
        BaseDataScopeDto baseDataScopeDto = new BaseDataScopeDto();
        baseDataScopeDto.setName(po.getName());
        baseDataScopeDto.setDataOfficeId(po.getDataOfficeId());
        baseDataScopeDto.setDataUserId(po.getDataUserId());
        baseDataScopeDto.setId(po.getId());
        baseDataScopeDto.setDataType(po.getDataType());
        baseDataScopeDto.setUpdateAt(po.getUpdateAt());
        baseDataScopeDto.setDataAreaId(po.getDataAreaId());
        baseDataScopeDto.setType(po.getType());
        return baseDataScopeDto;
    }
}