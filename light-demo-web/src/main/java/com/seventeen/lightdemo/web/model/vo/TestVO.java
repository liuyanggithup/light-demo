package com.seventeen.lightdemo.web.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author xia_xun
 */
@Data
public class TestVO {

    @ApiModelProperty(value = "test")
    private String test;

}