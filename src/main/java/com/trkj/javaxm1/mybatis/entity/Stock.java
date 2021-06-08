package com.trkj.javaxm1.mybatis.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Stock)实体类
 *
 * @author makejava
 * @since 2021-06-06 03:03:47
 */
@Data
public class Stock implements Serializable {
    private static final long serialVersionUID = -40553163486957132L;
    /**
     * 商品编号
     */
    private Integer skShopid;
    /**
     * 所在店面id外键
     */
    private Integer spStorefrontId;
    /**
     * 仓库id外键
     */
    private Integer spWarehouseId;
    /**
     * 商品库存数量
     */
    private Integer skNumber;
    /**
     * 最低库存(用于库存报警)
     */
    private Integer spNumber;
    /**
     * 损耗后数量
     */
    private Integer skLossNumber;


    public Integer getSkShopid() {
        return skShopid;
    }

    public void setSkShopid(Integer skShopid) {
        this.skShopid = skShopid;
    }

    public Integer getSpStorefrontId() {
        return spStorefrontId;
    }

    public void setSpStorefrontId(Integer spStorefrontId) {
        this.spStorefrontId = spStorefrontId;
    }

    public Integer getSpWarehouseId() {
        return spWarehouseId;
    }

    public void setSpWarehouseId(Integer spWarehouseId) {
        this.spWarehouseId = spWarehouseId;
    }

    public Integer getSkNumber() {
        return skNumber;
    }

    public void setSkNumber(Integer skNumber) {
        this.skNumber = skNumber;
    }

    public Integer getSpNumber() {
        return spNumber;
    }

    public void setSpNumber(Integer spNumber) {
        this.spNumber = spNumber;
    }

    public Integer getSkLossNumber() {
        return skLossNumber;
    }

    public void setSkLossNumber(Integer skLossNumber) {
        this.skLossNumber = skLossNumber;
    }

}
