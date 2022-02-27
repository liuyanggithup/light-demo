package com.seventeen.lightdemo.manager.api;

import com.seventeen.lightdemo.manager.api.model.dto.UserDTO;

/**
 * 用户服务远程请求封装
 *
 * @author: xia_xun
 */
public interface UserManager {

    /**
     * 根据token查询用户
     *
     * @param token 用户token
     * @return UserDTO
     */
    UserDTO findByToken(String token);

}
