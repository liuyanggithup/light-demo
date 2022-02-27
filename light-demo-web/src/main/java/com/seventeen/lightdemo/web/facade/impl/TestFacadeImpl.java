package com.seventeen.lightdemo.web.facade.impl;

import com.seventeen.lightdemo.service.api.TestService;
import com.seventeen.lightdemo.service.api.model.bo.TestBO;
import com.seventeen.lightdemo.share.component.ComponentLocator;
import com.seventeen.lightdemo.web.facade.TestFacade;
import com.seventeen.lightdemo.web.model.vo.TestVO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author seventeen
 */
@Component(value = "testFacade")
public class TestFacadeImpl implements TestFacade {

    @Resource
    private TestService testService;

    @Override
    public TestVO getById(Long id) {
        TestBO bo = testService.getById(id);
        return ComponentLocator.getConverter().convert(bo, TestVO.class);
    }
}
