package com.trkj.javaxm1.mybatis.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Supplier)实体类
 *
 * @author makejava
 * @since 2021-06-01 16:25:36
 */
@Data
public class Supplier implements Serializable {
    private static final long serialVersionUID = -97536869264035948L;

    private Integer sid;

    private Integer supplierid;
    /**
     * 供货商名称
     */
    private String suppliername;
    /**
     * 联系人
     */
    private String contacts;
    /**
     * 联系电话
     */
    private String contactnumber;
    /**
     * 供货商类型id
     */
    private Integer suptypeid;
    /**
     * 所属地区
     */
    private Integer addressid;
    /**
     * 应付金额
     */
    private Double payablemoney;
    /**
     * 所属分店
     */
    private Integer companyid;
    /**
     * 初期金额
     */
    private Double money;
    /**
     * 状态 0:正常 1:禁用
     */
    private Integer statics;
    /**
     * 1:正常，0：默认客户
     */
    private Integer ismoren;
    /**
     * 联系地址
     */
    private String lxaddress;
    /**
     * 创建时间
     */
    private Date cjtime;
    /**
     * 备注
     */
    private String beizhu;

    private Address address;
    private Branch branch;
    private Suppliertype suppliertype;


}
