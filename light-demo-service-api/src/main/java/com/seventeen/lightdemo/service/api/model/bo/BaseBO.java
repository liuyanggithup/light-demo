package com.seventeen.lightdemo.service.api.model.bo;

import lombok.Data;

import java.util.Date;

/**
 * 基础BO 包含数据库基础字段
 * @author: xia_xun
 */
@Data
public class BaseBO {

    /**
     * 主键ID TableId 设置自增主键
     */
    private Long id;

    /**
     * 数据创建时间
     */
    private Date createdAt;

    /**
     * 数据修改时间
     */
    private Date updatedAt;

    /**
     * 删除标记 0未删除 1已删除
     */
    private Boolean deleted;

}
