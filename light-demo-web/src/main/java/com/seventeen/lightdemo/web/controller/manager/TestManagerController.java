package com.seventeen.lightdemo.web.controller.manager;

import com.seventeen.common.response.ResponseData;
import com.seventeen.lightdemo.manager.api.UserManager;
import com.seventeen.lightdemo.web.facade.TestFacade;
import com.seventeen.lightdemo.web.model.vo.TestVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author seventeen
 */
@Api(value = "测试控制器", tags = "测试运营后台接口")
@RestController
@RequestMapping(value = "/managerApi/test")
public class TestManagerController {

    @Resource
    private TestFacade testFacade;

    @Resource
    private UserManager userManager;


    @ApiOperation(value = "根据主键查询")
    @GetMapping(value = "/getById")
    public ResponseData<TestVO> getById(Long id) {
        //manager 调用
        userManager.findByToken("1111");
        return ResponseData.success(testFacade.getById(id));
    }

}
