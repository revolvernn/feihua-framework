package com.feihua.framework.spider.api;

import com.feihua.framework.spider.dto.SpiderResultDto;
import com.feihua.framework.spider.po.SpiderResultPo;

/**
 * This class was generated by MyBatis Generator.
 * @author yangwei 2018-12-19 17:20:07
 */
public interface ApiSpiderResultPoService extends feihua.jdbc.api.service.ApiBaseService<SpiderResultPo, SpiderResultDto, String> {

    SpiderResultPo selectByUrl(String url);
}