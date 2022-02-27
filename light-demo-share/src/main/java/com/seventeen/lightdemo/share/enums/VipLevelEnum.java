package com.seventeen.lightdemo.share.enums;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * 会员等级
 * @author xia_xun
 */
public enum VipLevelEnum {

    /**
     * 普通会员
     */
    REGULAR_VIP(127, "普通会员");

    private final int code;
    private final String msg;

    VipLevelEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static String getNameByCode(Integer code) {
        return Stream.of(VipLevelEnum.values()).filter(o -> Objects.equals(o.getCode(), code)).findAny().map(Enum::name).orElse(null);
    }

    public static VipLevelEnum getEnumByCode(Integer code) {
        return Stream.of(VipLevelEnum.values()).filter(o -> Objects.equals(o.getCode(), code)).findAny().orElse(null);
    }
}
