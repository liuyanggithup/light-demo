package com.seventeen.lightdemo.web.facade;

import com.seventeen.lightdemo.web.model.vo.TestVO;

/**
 * @author seventeen
 */
public interface TestFacade {

    /**
     * 根据主键查询
     *
     * @param id
     * @return
     */
    TestVO getById(Long id);
}
