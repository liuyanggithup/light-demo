package com.seventeen.lightdemo.share.component.convertor.impl;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.google.common.collect.Lists;
import com.seventeen.common.exception.WarnException;
import com.seventeen.common.response.ResponseData;
import com.seventeen.common.utils.StringUtil;
import com.seventeen.lightdemo.share.component.convertor.ConverterFacade;
import com.seventeen.lightdemo.share.component.convertor.MapperConverter;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Bean对象转化器，可用于DO,BO,VO对象的转换
 *
 * @author seventeen
 */
@Component(value = "beanConverter")
public class ConverterFacadeImpl implements ConverterFacade {

    @Override
    public <T, E> T convert(E source, Class<T> destinationClass) {
        if (source == null) {
            return null;
        }
        return MapperConverter.INSTANCE.map(destinationClass, source);
    }

    @Override
    public <T, E> List<T> convertList(List<E> sources, Class<T> destinationClass) {
        if (CollectionUtils.isEmpty(sources)) {
            return Lists.newArrayList();
        }
        return MapperConverter.INSTANCE.mapAsList(destinationClass, sources);
    }

    @Override
    public <T> ResponseData<T> parseResponse(String jsonString, Class<T> clazz) {
        if (StringUtil.isBlank(jsonString)) {
            return ResponseData.fail("获取结果失败");
        }

        ResponseData<T> rd;
        try {
            rd = JSONObject.parseObject(jsonString, new TypeReference<ResponseData<T>>() {
            });
        } catch (JSONException e) {
            throw new WarnException("api数据格式不正确");
        }

        if (rd.getData() != null) {
            try {
                rd.setData(JSONObject.parseObject(rd.getData().toString(), clazz));
            } catch (JSONException e) {
                throw new WarnException("api数据格式不正确");
            }
            return rd;
        }
        return rd;
    }

}
