package com.seventeen.lightdemo.manager.impl;

import com.alibaba.fastjson.JSON;
import com.seventeen.common.response.ResponseData;
import com.seventeen.lightdemo.manager.api.UserManager;
import com.seventeen.lightdemo.manager.api.model.dto.UserDTO;
import com.seventeen.lightdemo.manager.rest.UserRest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author: xia_xun
 */
@Component
@Slf4j
public class UserManagerImpl implements UserManager {

    @Resource
    private UserRest userRest;

    @Override
    public UserDTO findByToken(String token) {
        ResponseData<UserDTO> resp = userRest.findByToken(token);
        if(resp.isSuccess()){
            return resp.getData();
        }
        log.warn("根据 token {} 查询用户失败，result {}",token, JSON.toJSONString(resp));
        return null;
    }
}
