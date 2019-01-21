package com.feihua.framework.cms.impl;

import com.feihua.framework.cms.api.ApiCmsContentVedioOtherPlayerPoService;
import com.feihua.framework.cms.dto.CmsContentVedioOtherPlayerDto;
import com.feihua.framework.cms.po.CmsContentVedioOtherPlayerPo;
import feihua.jdbc.api.pojo.BasePo;
import feihua.jdbc.api.service.impl.ApiBaseServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This class was generated by MyBatis Generator.
 * @author yangwei 2018-12-24 13:42:45
 */
@Service
public class ApiCmsContentVedioOtherPlayerPoServiceImpl extends ApiBaseServiceImpl<CmsContentVedioOtherPlayerPo, CmsContentVedioOtherPlayerDto, String> implements ApiCmsContentVedioOtherPlayerPoService {
    @Autowired
    com.feihua.framework.cms.mapper.CmsContentVedioOtherPlayerPoMapper CmsContentVedioOtherPlayerPoMapper;

    public ApiCmsContentVedioOtherPlayerPoServiceImpl() {
        super(CmsContentVedioOtherPlayerDto.class);
    }

    @Override
    public List<CmsContentVedioOtherPlayerPo> selectBySiteIdAndContentIdAndVedioId(String siteId, String contentId, String vedioId) {
        if(StringUtils.isAnyEmpty(siteId,contentId)){
            return null;
        }
        CmsContentVedioOtherPlayerPo cmsContentVedioOtherPlayerPo = new CmsContentVedioOtherPlayerPo();
        cmsContentVedioOtherPlayerPo.setSiteId(siteId);
        cmsContentVedioOtherPlayerPo.setContentId(contentId);
        cmsContentVedioOtherPlayerPo.setVedioId(vedioId);
        cmsContentVedioOtherPlayerPo.setDelFlag(BasePo.YesNo.N.name());
        return selectListSimple(cmsContentVedioOtherPlayerPo);
    }
    @Override
    public CmsContentVedioOtherPlayerDto wrapDto(CmsContentVedioOtherPlayerPo po) {
        if (po == null) { return null; }
        CmsContentVedioOtherPlayerDto dto = new CmsContentVedioOtherPlayerDto();
        dto.setId(po.getId());
        dto.setSiteId(po.getSiteId());
        dto.setContentId(po.getContentId());
        dto.setVedioId(po.getVedioId());
        dto.setPlayer(po.getPlayer());
        dto.setUrl(po.getUrl());
        dto.setDataUserId(po.getDataUserId());
        dto.setDataOfficeId(po.getDataOfficeId());
        dto.setDataType(po.getDataType());
        dto.setDataAreaId(po.getDataAreaId());
        dto.setUpdateAt(po.getUpdateAt());
        return dto;
    }

}