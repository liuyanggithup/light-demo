package com.seventeen.lightdemo.dao.mapper;

import com.seventeen.lightdemo.dao.model.dataobject.TestDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * DAO
 *
 * @author: xia_xun
 */
@Mapper
public interface TestDAO {

    /**
     * 根据id查询test
     *
     * @param id 主键ID
     * @return TestDO
     */
    TestDO selectById(Long id);
}
