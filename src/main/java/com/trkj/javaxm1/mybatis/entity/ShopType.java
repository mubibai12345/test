package com.trkj.javaxm1.mybatis.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (ShopType)实体类
 *
 * @author makejava
 * @since 2021-05-31 15:14:35
 */
@Data
public class ShopType implements Serializable {
    private static final long serialVersionUID = 624958503250783307L;

    private Integer spTypeId;

    private String spTypeName;


    public Integer getSpTypeId() {
        return spTypeId;
    }

    public void setSpTypeId(Integer spTypeId) {
        this.spTypeId = spTypeId;
    }

    public String getSpTypeName() {
        return spTypeName;
    }

    public void setSpTypeName(String spTypeName) {
        this.spTypeName = spTypeName;
    }

}
