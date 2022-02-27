package com.seventeen.lightdemo.share.component.convertor;

import com.seventeen.common.response.ResponseData;

import java.util.List;

/**
 * Bean对象转化器，可用于DO,BO,VO对象的转换
 *
 * @author seventeen
 */
public interface ConverterFacade {

    /**
     * 单个对象数据转换
     *
     * @param source           源数据
     * @param destinationClass Clazz
     * @param <T>              结果类型
     * @param <E>              源数据类型
     * @return
     */
    <T, E> T convert(E source, Class<T> destinationClass);

    /**
     * 列表数据转换
     *
     * @param sources          源数据
     * @param destinationClass Clazz
     * @param <T>              结果类型
     * @param <E>              源数据类型
     * @return
     */
    <T, E> List<T> convertList(List<E> sources, Class<T> destinationClass);

    /**
     * 平台Api数据反序列化
     *
     * @param jsonString json
     * @param clazz      Clazz
     * @param <T>        返回结果类型
     * @return
     */
    <T> ResponseData<T> parseResponse(String jsonString, Class<T> clazz);
}
