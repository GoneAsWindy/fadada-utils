package com.yunji.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fadada.sdk.client.FddClientBase;
import com.yunji.exception.FddUploadException;

import java.io.File;
import java.util.UUID;

/**
 * Create by matthew on 2018/3/17
 * @author Matthew
 * @date 2018/03/17
 */
public class FadadaUtil {

    public String uploadTemplate(File contractTemplate) throws FddUploadException {
        String templateId = UUID.randomUUID().toString();
        FddClientBase clientBase = new FddClientBase(FddConstant.APP_ID, FddConstant.APP_SECRET, FddConstant.VERSION, FddConstant.URL);
        String result = clientBase.invokeUploadTemplate(templateId, contractTemplate, null);
        JSONObject jb = JSON.parseObject(result);
        String code = jb.getString("code");
        if (FddConstant.SUCCESS.equals(code)) {
            return templateId;
        } else {
            throw new FddUploadException(jb.getString("msg"));
        }
    }


}
