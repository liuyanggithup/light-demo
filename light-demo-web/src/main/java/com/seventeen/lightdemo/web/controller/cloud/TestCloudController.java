package com.seventeen.lightdemo.web.controller.cloud;

import com.seventeen.common.response.ResponseData;
import com.seventeen.lightdemo.share.component.redis.RedisFacade;
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
@Api(value = "测试控制器", tags = "测试cloud接口")
@RestController
@RequestMapping(value = "/cloudApi/test")
public class TestCloudController {

    @Resource
    private TestFacade testFacade;
    @Resource
    private RedisFacade redisFacade;

    @ApiOperation(value = "根据主键查询")
    @GetMapping(value = "/getById")
    public ResponseData<TestVO> getById(Long id) {
        return ResponseData.success(testFacade.getById(id));
    }

    @GetMapping(value = "getRedisLock")
    public ResponseData<Boolean> getRedisLock() {
        boolean b = redisFacade.lock("seventeen");
        return ResponseData.success(b);
    }
}
