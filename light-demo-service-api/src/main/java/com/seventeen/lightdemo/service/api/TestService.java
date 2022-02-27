package com.seventeen.lightdemo.service.api;


import com.seventeen.lightdemo.service.api.model.bo.TestBO;

/**
 * 测试service 接口
 *
 * @author: xia_xun
 */
public interface TestService {

    /**
     * 根据主键查询
     *
     * @param id 主键ID
     * @return TestBO
     */
    TestBO getById(Long id);
}
