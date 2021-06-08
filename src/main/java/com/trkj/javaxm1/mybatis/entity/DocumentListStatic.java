package com.trkj.javaxm1.mybatis.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (DocumentListStatic)实体类
 *
 * @author makejava
 * @since 2021-06-07 11:37:57
 */
@Data
public class DocumentListStatic implements Serializable {
    private static final long serialVersionUID = 317037517761743340L;
    /**
     * 单据状态id
     */
    private Integer dlStatieId;
    /**
     * 单据状态名称
     */
    private String dlStatieName;


    public Integer getDlStatieId() {
        return dlStatieId;
    }

    public void setDlStatieId(Integer dlStatieId) {
        this.dlStatieId = dlStatieId;
    }

    public String getDlStatieName() {
        return dlStatieName;
    }

    public void setDlStatieName(String dlStatieName) {
        this.dlStatieName = dlStatieName;
    }

}
