package com.trkj.javaxm1.mybatis.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (DocumentShop)实体类
 *
 * @author makejava
 * @since 2021-06-07 11:13:54
 */
@Data
public class DocumentShop implements Serializable {
    private static final long serialVersionUID = 957001055404498061L;
    /**
     * 自增id
     */
    private Integer id;
    /**
     * 单据表外键单据号
     */
    private String dlNumber;
    /**
     * 供货商外键id
     */
    private Integer supplierid;
    /**
     * 客户外键id
     */
    private Integer customerid;
    /**
     * 所在仓库外键id
     */
    private Integer wid;
    /**
     * 商品编号外键id
     */
    private Integer spShopid;
    /**
     * 商品名称
     */
    private String spName;
    /**
     * 单位
     */
    private String spCompany;
    /**
     * 单价
     */
    private Double spJprice;
    /**
     * 数量
     */
    private Integer number;
    /**
     * 损耗后数量
     */
    private Integer lossNumber;
    /**
     * 总金额
     */
    private Double zje;
    /**
     * 规格型号
     */
    private String spSpecifications;
    /**
     * 颜色
     */
    private String spColor;
    /**
     * 备注
     */
    private String beizhu;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDlNumber() {
        return dlNumber;
    }

    public void setDlNumber(String dlNumber) {
        this.dlNumber = dlNumber;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public Integer getSpShopid() {
        return spShopid;
    }

    public void setSpShopid(Integer spShopid) {
        this.spShopid = spShopid;
    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public String getSpCompany() {
        return spCompany;
    }

    public void setSpCompany(String spCompany) {
        this.spCompany = spCompany;
    }

    public Double getSpJprice() {
        return spJprice;
    }

    public void setSpJprice(Double spJprice) {
        this.spJprice = spJprice;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getLossNumber() {
        return lossNumber;
    }

    public void setLossNumber(Integer lossNumber) {
        this.lossNumber = lossNumber;
    }

    public Double getZje() {
        return zje;
    }

    public void setZje(Double zje) {
        this.zje = zje;
    }

    public String getSpSpecifications() {
        return spSpecifications;
    }

    public void setSpSpecifications(String spSpecifications) {
        this.spSpecifications = spSpecifications;
    }

    public String getSpColor() {
        return spColor;
    }

    public void setSpColor(String spColor) {
        this.spColor = spColor;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

}
