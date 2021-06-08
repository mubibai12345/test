package com.trkj.javaxm1.mybatis.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (DocumentListType)实体类
 *
 * @author makejava
 * @since 2021-06-07 13:51:22
 */
@Data
public class DocumentListType implements Serializable {
    private static final long serialVersionUID = -19791005443582230L;
    /**
     * 单据类型id
     */
    private Integer dlTypeId;
    /**
     * 单据类型名称
     */
    private String dlTypeName;


    public Integer getDlTypeId() {
        return dlTypeId;
    }

    public void setDlTypeId(Integer dlTypeId) {
        this.dlTypeId = dlTypeId;
    }

    public String getDlTypeName() {
        return dlTypeName;
    }

    public void setDlTypeName(String dlTypeName) {
        this.dlTypeName = dlTypeName;
    }

}
