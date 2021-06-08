package com.trkj.javaxm1.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.javaxm1.mybatis.dao.SupplierDao;
import com.trkj.javaxm1.mybatis.entity.Shop;
import com.trkj.javaxm1.mybatis.entity.Supplier;
import com.trkj.javaxm1.service.SupplierService;
import com.trkj.javaxm1.util.BeanTools;
import com.trkj.javaxm1.vo.ShopVo;
import com.trkj.javaxm1.vo.SupplierVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("supplierService")
public class SupplierServiceImpl implements SupplierService {
    @Resource
    private SupplierDao supplierDao;

    /**
     * 供货商，供货商类型，供货商所属地区，所属分店的链表查询
     * @param currentPage
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<SupplierVo> findAllPage(Integer currentPage, Integer pageSize) {
        List<Supplier> list = supplierDao.findAll();
        Page<Supplier> page= PageHelper.startPage(currentPage,pageSize,true);
        List<Supplier> list2 = supplierDao.findAll();
        List<SupplierVo> vos = new ArrayList<>();
        BeanTools.copyList(list2,vos,SupplierVo.class);
        PageInfo<SupplierVo> info = new PageInfo<>(vos);
        info.setTotal((long)list.size());
        return info;
    }

    /**
     * 根据分店类型和关键字查询
     * @param branchid
     * @param suppliername
     * @return
     */
    @Override
    public PageInfo<SupplierVo> findAllByName(String branchnames, String suppliername,Integer currentPage, Integer pageSize) {
        List<Supplier> list = supplierDao.findAllByName(branchnames,suppliername);
        Page<Supplier> page = PageHelper.startPage(currentPage,pageSize,true);
        List<Supplier> list2 = supplierDao.findAllByName(branchnames,suppliername);
        List<SupplierVo> vos = new ArrayList<>();
        BeanTools.copyList(list2,vos,SupplierVo.class);
        PageInfo<SupplierVo> info = new PageInfo<>(vos);
        info.setTotal((long)list.size());
        return info;
    }

    /**
     * 添加供货商
     * @param supplier
     * @return
     */
    @Override
    public Integer addsupplier(Supplier supplier) {

        return this.supplierDao.insert(supplier);
    }

    /**
     * 修改供货商
     * @param supplier
     * @return
     */
    @Override
    public Integer upsupplier(Supplier supplier) {
        return supplierDao.update(supplier);
    }

    /**
     * 批量删除数据
     * @param supplierid
     * @return
     */
    @Override
    public Integer deletepl(Integer[] supplierid) {

        return supplierDao.pildelsup(supplierid);
    }
}
