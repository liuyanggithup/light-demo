package com.seventeen.lightdemo.dao.model.dataobject;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author: xia_xun
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TestDO extends BaseDO{

    /**
     * 测试字段
     */
    private String test;

}
