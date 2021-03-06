package com.feihua.framework.cms.impl;

import com.feihua.framework.cms.api.ApiCmsContentAudioPoService;
import com.feihua.framework.cms.dto.CmsContentAudioDto;
import com.feihua.framework.cms.po.CmsContentAudioPo;
import feihua.jdbc.api.pojo.BasePo;
import feihua.jdbc.api.service.impl.ApiBaseServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class was generated by MyBatis Generator.
 * @author yangwei 2018-12-13 14:45:35
 */
@Service
public class ApiCmsContentAudioPoServiceImpl extends ApiBaseServiceImpl<CmsContentAudioPo, CmsContentAudioDto, String> implements ApiCmsContentAudioPoService {
    @Autowired
    com.feihua.framework.cms.mapper.CmsContentAudioPoMapper CmsContentAudioPoMapper;

    public ApiCmsContentAudioPoServiceImpl() {
        super(CmsContentAudioDto.class);
    }


    @Override
    public CmsContentAudioPo selectBySiteIdAndContentId(String siteId, String contentId) {
        if(StringUtils.isAnyEmpty(siteId,contentId)){
            return null;
        }
        CmsContentAudioPo cmsContentAudioPo = new CmsContentAudioPo();
        cmsContentAudioPo.setSiteId(siteId);
        cmsContentAudioPo.setContentId(contentId);
        cmsContentAudioPo.setDelFlag(BasePo.YesNo.N.name());
        return selectOneSimple(cmsContentAudioPo);
    }

    @Override
    public CmsContentAudioDto wrapDto(CmsContentAudioPo po) {
        if (po == null) { return null; }
        CmsContentAudioDto dto = new CmsContentAudioDto();
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
        dto.setDuration(po.getDuration());
        dto.setPlayer(po.getPlayer());
        dto.setDirector(po.getDirector());
        dto.setPerformer(po.getPerformer());
        dto.setLanguage(po.getLanguage());
        dto.setDataUserId(po.getDataUserId());
        dto.setDataOfficeId(po.getDataOfficeId());
        dto.setDataType(po.getDataType());
        dto.setDataAreaId(po.getDataAreaId());
        dto.setUpdateAt(po.getUpdateAt());
        dto.setAlbum(po.getAlbum());
        dto.setLrc(po.getLrc());
        dto.setRegion(po.getRegion());
        dto.setYears(po.getYears());
        return dto;
    }
}