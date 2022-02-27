package com.seventeen.lightdemo.manager.rest;

import com.seventeen.common.response.ResponseData;
import com.seventeen.lightdemo.manager.api.model.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * rpc调用，三方调用等统一返回DTO
 *
 * @author xia_xun
 */
@FeignClient(name = "light-user", path = "/api/lightUser/cloudApi/user", configuration = FeignAutoConfiguration.class)
public interface UserRest {

    /**
     * 使用标准java doc 注释
     *
     * @param token token
     * @return 用户信息
     */
    @GetMapping("/authority")
    ResponseData<UserDTO> findByToken(@RequestParam("token") String token);
}
