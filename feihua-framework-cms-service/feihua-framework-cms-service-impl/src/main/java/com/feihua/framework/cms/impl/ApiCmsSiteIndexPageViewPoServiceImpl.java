package com.feihua.framework.cms.impl;

import com.feihua.framework.cms.api.ApiCmsSiteIndexPageViewPoService;
import com.feihua.framework.cms.dto.CmsSiteIndexPageViewDto;
import com.feihua.framework.cms.po.CmsSiteIndexPageViewPo;
import com.feihua.utils.calendar.CalendarUtils;
import feihua.jdbc.api.service.impl.ApiBaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * This class was generated by MyBatis Generator.
 * @author yangwei 2018-12-05 16:43:17
 */
@Service
public class ApiCmsSiteIndexPageViewPoServiceImpl extends ApiBaseServiceImpl<CmsSiteIndexPageViewPo, CmsSiteIndexPageViewDto, String> implements ApiCmsSiteIndexPageViewPoService {
    @Autowired
    com.feihua.framework.cms.mapper.CmsSiteIndexPageViewPoMapper CmsSiteIndexPageViewPoMapper;

    public ApiCmsSiteIndexPageViewPoServiceImpl() {
        super(CmsSiteIndexPageViewDto.class);
    }


    @Override
    public int computeIv(String contentId, Date date) {
        Date start = CalendarUtils.resetTimeToZero(date);
        Date end = CalendarUtils.resetTimeToLast(date);
        return CmsSiteIndexPageViewPoMapper.computeIv(contentId,start,end);
    }

    @Override
    public int existHost(String host, Date date) {
        Date start = CalendarUtils.resetTimeToZero(date);
        Date end = CalendarUtils.resetTimeToLast(date);
        return CmsSiteIndexPageViewPoMapper.existHost(host,start,end);
    }

    @Override
    public int computeUv(String contentId, Date date) {
        Date start = CalendarUtils.resetTimeToZero(date);
        Date end = CalendarUtils.resetTimeToLast(date);
        return CmsSiteIndexPageViewPoMapper.computeUv(contentId,start,end);
    }

    @Override
    public int existCookie(String cookie, Date date) {
        Date start = CalendarUtils.resetTimeToZero(date);
        Date end = CalendarUtils.resetTimeToLast(date);
        return CmsSiteIndexPageViewPoMapper.existCookie(cookie,start,end);
    }

    @Override
    public CmsSiteIndexPageViewDto wrapDto(CmsSiteIndexPageViewPo po) {
        if (po == null) { return null; }
        CmsSiteIndexPageViewDto dto = new CmsSiteIndexPageViewDto();
        dto.setId(po.getId());
        dto.setSiteId(po.getSiteId());
        dto.setCookie(po.getCookie());
        dto.setHost(po.getHost());
        dto.setDataUserId(po.getDataUserId());
        dto.setDataOfficeId(po.getDataOfficeId());
        dto.setDataType(po.getDataType());
        dto.setDataAreaId(po.getDataAreaId());
        dto.setUpdateAt(po.getUpdateAt());
        return dto;
    }
}