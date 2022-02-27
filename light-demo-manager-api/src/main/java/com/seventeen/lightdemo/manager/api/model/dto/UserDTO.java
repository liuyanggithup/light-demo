package com.seventeen.lightdemo.manager.api.model.dto;

import lombok.Data;


/**
 * 用户DTO
 *
 * @author: xia_xun
 */
@Data
public class UserDTO {


    private Long id;

    /**
     * 用户类型
     */
    private Integer userType;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户昵称
     */
    private String nick;

    /**
     * 手机号
     */
    private String phone;

}
