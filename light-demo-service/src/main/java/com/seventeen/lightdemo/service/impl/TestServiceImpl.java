package com.seventeen.lightdemo.service.impl;

import com.seventeen.lightdemo.dao.mapper.TestDAO;
import com.seventeen.lightdemo.dao.model.dataobject.TestDO;
import com.seventeen.lightdemo.service.api.TestService;
import com.seventeen.lightdemo.service.api.model.bo.TestBO;
import com.seventeen.lightdemo.share.component.ComponentLocator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xia_xun
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestDAO testDAO;

    @Override
    public TestBO getById(Long id) {
        TestDO testDO = testDAO.selectById(id);
        return ComponentLocator.getConverter().convert(testDO, TestBO.class);
    }

}
