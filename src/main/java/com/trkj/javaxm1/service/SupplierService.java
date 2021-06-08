package com.trkj.javaxm1.service;

import com.github.pagehelper.PageInfo;
import com.trkj.javaxm1.mybatis.entity.Supplier;
import com.trkj.javaxm1.vo.SupplierVo;

import java.util.List;

public interface SupplierService {
    PageInfo<SupplierVo> findAllPage(Integer currentPage, Integer pageSize);
    PageInfo<SupplierVo> findAllByName(String branchnames,String suppliername,Integer currentPage, Integer pageSize);
    Integer addsupplier(Supplier supplier);

    Integer upsupplier(Supplier supplier);

    Integer deletepl(Integer[] supplierid);


}
