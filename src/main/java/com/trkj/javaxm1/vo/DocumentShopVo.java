package com.trkj.javaxm1.vo;

import lombok.Data;

@Data
public class DocumentShopVo {
    /**
     * id
     */
    private Integer id;
    /**
     * 单据号
     */
    private String dlNumber;
    /**
     * 商品编号
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
     * 当前库存
     */
    private Integer sk_number;
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
}
