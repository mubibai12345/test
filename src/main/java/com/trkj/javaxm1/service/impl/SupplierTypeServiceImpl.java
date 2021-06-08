package com.trkj.javaxm1.service.impl;

import com.trkj.javaxm1.mybatis.dao.SuppliertypeDao;
import com.trkj.javaxm1.mybatis.entity.Suppliertype;
import com.trkj.javaxm1.service.SupplierTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("supplierTypeService")
public class SupplierTypeServiceImpl implements SupplierTypeService {
    @Resource
    private SuppliertypeDao suppliertypeDao;

    @Override
    public List<Suppliertype> findall() {
        return suppliertypeDao.findAll();
    }
}
