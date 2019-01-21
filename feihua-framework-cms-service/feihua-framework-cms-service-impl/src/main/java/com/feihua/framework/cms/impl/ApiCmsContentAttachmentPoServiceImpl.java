package com.feihua.framework.cms.impl;

import com.feihua.exception.BaseException;
import com.feihua.exception.ParamInvalidException;
import com.feihua.framework.cms.api.ApiCmsContentAttachmentPoService;
import com.feihua.framework.cms.dto.CmsContentAttachmentDto;
import com.feihua.framework.cms.po.CmsContentAttachmentPo;
import feihua.jdbc.api.pojo.BasePo;
import feihua.jdbc.api.service.impl.ApiBaseServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This class was generated by MyBatis Generator.
 * @author yangwei 2018-12-06 15:40:14
 */
@Service
public class ApiCmsContentAttachmentPoServiceImpl extends ApiBaseServiceImpl<CmsContentAttachmentPo, CmsContentAttachmentDto, String> implements ApiCmsContentAttachmentPoService {
    @Autowired
    com.feihua.framework.cms.mapper.CmsContentAttachmentPoMapper CmsContentAttachmentPoMapper;

    public ApiCmsContentAttachmentPoServiceImpl() {
        super(CmsContentAttachmentDto.class);
    }


    @Override
    public List<CmsContentAttachmentPo> selectBySiteIdAndContentId(String siteId, String contentId) {
        if (StringUtils.isEmpty(siteId)) {
            return null;
        }
        CmsContentAttachmentPo cmsContentAttachmentPo = new CmsContentAttachmentPo();
        cmsContentAttachmentPo.setSiteId(siteId);
        cmsContentAttachmentPo.setContentId(contentId);
        cmsContentAttachmentPo.setDelFlag(BasePo.YesNo.N.name());
        return this.selectListSimple(cmsContentAttachmentPo);
    }

    @Override
    public int deleteBySiteIdAndContentId(String siteId, String contentId,String currentUserId) {
        if (StringUtils.isAnyEmpty(siteId,contentId,currentUserId)) {
            throw new ParamInvalidException("siteId,contentId,currentUserId can not be null or empty");
        }
        CmsContentAttachmentPo cmsContentAttachmentPo = new CmsContentAttachmentPo();
        cmsContentAttachmentPo.setSiteId(siteId);
        cmsContentAttachmentPo.setContentId(contentId);
        cmsContentAttachmentPo.setDelFlag(BasePo.YesNo.N.name());
        return this.deleteFlagSelectiveWithUpdateUser(cmsContentAttachmentPo,currentUserId);
    }

    @Override
    public CmsContentAttachmentDto wrapDto(CmsContentAttachmentPo po) {
        if (po == null) { return null; }
        CmsContentAttachmentDto dto = new CmsContentAttachmentDto();
        dto.setId(po.getId());
        dto.setSiteId(po.getSiteId());
        dto.setContentId(po.getContentId());
        dto.setFilename(po.getFilename());
        dto.setUrl(po.getUrl());
        dto.setExt(po.getExt());
        dto.setType(po.getType());
        dto.setDwonloadNum(po.getDwonloadNum());
        dto.setSize(po.getSize());
        dto.setDescription(po.getDescription());
        dto.setImageUrl(po.getImageUrl());
        dto.setImageDes(po.getImageDes());
        dto.setSequence(po.getSequence());
        dto.setDataUserId(po.getDataUserId());
        dto.setDataOfficeId(po.getDataOfficeId());
        dto.setDataType(po.getDataType());
        dto.setDataAreaId(po.getDataAreaId());
        dto.setUpdateAt(po.getUpdateAt());
        return dto;
    }

}