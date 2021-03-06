package com.feihua.framework.cms.impl;

import com.feihua.exception.ParamInvalidException;
import com.feihua.framework.cms.api.ApiCmsContentCategoryRelPoService;
import com.feihua.framework.cms.dto.CmsContentCategoryRelDto;
import com.feihua.framework.cms.po.CmsContentCategoryRelPo;
import feihua.jdbc.api.pojo.BasePo;
import feihua.jdbc.api.service.impl.ApiBaseServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This class was generated by MyBatis Generator.
 * @author yangwei 2018-12-06 15:38:46
 */
@Service
public class ApiCmsContentCategoryRelPoServiceImpl extends ApiBaseServiceImpl<CmsContentCategoryRelPo, CmsContentCategoryRelDto, String> implements ApiCmsContentCategoryRelPoService {
    @Autowired
    com.feihua.framework.cms.mapper.CmsContentCategoryRelPoMapper CmsContentCategoryRelPoMapper;

    public ApiCmsContentCategoryRelPoServiceImpl() {
        super(CmsContentCategoryRelDto.class);
    }

    @Override
    public List<CmsContentCategoryRelPo> selectBySiteIdAndContentId(String siteId, String contentId) {
        if (StringUtils.isEmpty(siteId)) return null;
        CmsContentCategoryRelPo cmsContentCategoryRelPo = new CmsContentCategoryRelPo();
        cmsContentCategoryRelPo.setSiteId(siteId);
        cmsContentCategoryRelPo.setContentId(contentId);
        cmsContentCategoryRelPo.setDelFlag(BasePo.YesNo.N.name());
        return this.selectListSimple(cmsContentCategoryRelPo);
    }

    @Override
    public List<CmsContentCategoryRelPo> selectBySiteIdAndCategoryId(String siteId, String categoryId) {
        if (StringUtils.isEmpty(siteId)) return null;
        CmsContentCategoryRelPo cmsContentCategoryRelPo = new CmsContentCategoryRelPo();
        cmsContentCategoryRelPo.setSiteId(siteId);
        cmsContentCategoryRelPo.setContentCategoryId(categoryId);
        cmsContentCategoryRelPo.setDelFlag(BasePo.YesNo.N.name());
        return this.selectListSimple(cmsContentCategoryRelPo);
    }

    @Override
    public int deleteBySiteIdAndContentId(String siteId, String contentId,String currentUserId) {
        int r = 0;
        if (StringUtils.isAnyEmpty(siteId,contentId)) {
            throw new ParamInvalidException("siteId,contentId,currentUserId can not be null or empty");

        }
        CmsContentCategoryRelPo cmsContentCategoryRelPo = new CmsContentCategoryRelPo();
        cmsContentCategoryRelPo.setSiteId(siteId);
        cmsContentCategoryRelPo.setContentId(contentId);
        cmsContentCategoryRelPo.setDelFlag(BasePo.YesNo.N.name());
        r = this.deleteFlagSelectiveWithUpdateUser(cmsContentCategoryRelPo,currentUserId);
        return r;
    }

    @Override
    public CmsContentCategoryRelDto wrapDto(CmsContentCategoryRelPo po) {
        if (po == null) { return null; }
        CmsContentCategoryRelDto dto = new CmsContentCategoryRelDto();
        dto.setId(po.getId());
        dto.setContentCategoryId(po.getContentCategoryId());
        dto.setContentId(po.getContentId());
        dto.setSiteId(po.getSiteId());
        dto.setDataUserId(po.getDataUserId());
        dto.setDataOfficeId(po.getDataOfficeId());
        dto.setDataType(po.getDataType());
        dto.setDataAreaId(po.getDataAreaId());
        dto.setUpdateAt(po.getUpdateAt());
        return dto;
    }

}