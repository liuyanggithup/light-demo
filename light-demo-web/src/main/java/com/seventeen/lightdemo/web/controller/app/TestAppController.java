package com.seventeen.lightdemo.web.controller.app;

import com.seventeen.common.response.ResponseData;
import com.seventeen.lightdemo.manager.api.UserManager;
import com.seventeen.lightdemo.web.facade.TestFacade;
import com.seventeen.lightdemo.web.model.vo.TestVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author seventeen
 */
@Api(value = "测试控制器", tags = "测试app接口")
@RestController
@RequestMapping(value = "/appApi/test")
@Slf4j
public class TestAppController {


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
