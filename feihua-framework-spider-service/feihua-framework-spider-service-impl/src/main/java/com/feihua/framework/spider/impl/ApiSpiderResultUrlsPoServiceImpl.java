package com.feihua.framework.spider.impl;

import com.feihua.framework.spider.api.ApiSpiderResultUrlsPoService;
import com.feihua.framework.spider.dto.SpiderResultUrlsDto;
import com.feihua.framework.spider.po.SpiderResultUrlsPo;
import feihua.jdbc.api.service.impl.ApiBaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class was generated by MyBatis Generator.
 * @author yangwei 2018-12-19 21:08:09
 */
@Service
public class ApiSpiderResultUrlsPoServiceImpl extends ApiBaseServiceImpl<SpiderResultUrlsPo, SpiderResultUrlsDto, String> implements ApiSpiderResultUrlsPoService {
    @Autowired
    com.feihua.framework.spider.mapper.SpiderResultUrlsPoMapper SpiderResultUrlsPoMapper;

    public ApiSpiderResultUrlsPoServiceImpl() {
        super(SpiderResultUrlsDto.class);
    }

    @Override
    public SpiderResultUrlsDto wrapDto(SpiderResultUrlsPo po) {
        if (po == null) { return null; }
        SpiderResultUrlsDto dto = new SpiderResultUrlsDto();
        dto.setId(po.getId());
        dto.setConfigSourceId(po.getConfigSourceId());
        dto.setResultId(po.getResultId());
        dto.setUrlText(po.getUrlText());
        dto.setUrl(po.getUrl());
        dto.setUrlFull(po.getUrlFull());
        dto.setType(po.getType());
        dto.setDataUserId(po.getDataUserId());
        dto.setDataOfficeId(po.getDataOfficeId());
        dto.setDataType(po.getDataType());
        dto.setDataAreaId(po.getDataAreaId());
        dto.setUpdateAt(po.getUpdateAt());
        return dto;
    }
}