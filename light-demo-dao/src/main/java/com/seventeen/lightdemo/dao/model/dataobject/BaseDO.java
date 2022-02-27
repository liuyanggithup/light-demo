package com.seventeen.lightdemo.dao.model.dataobject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * 所有的DO 都继承BaseDO
 *
 * @author: xia_xun
 */
@Data
public class BaseDO {

    /**
     * 主键ID TableId 设置自增主键
     */
    @TableId(type = IdType.AUTO)
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
