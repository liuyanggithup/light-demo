package com.seventeen.lightdemo.service.api.model.bo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author: xia_xun
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TestBO extends BaseBO {

    /**
     * test字段
     */
    private String test;

}