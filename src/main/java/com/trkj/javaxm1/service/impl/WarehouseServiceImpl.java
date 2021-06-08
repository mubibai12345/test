package com.trkj.javaxm1.service.impl;

import com.trkj.javaxm1.mybatis.entity.Warehouse;
import com.trkj.javaxm1.mybatis.dao.WarehouseDao;
import com.trkj.javaxm1.service.WarehouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Warehouse)表服务实现类
 *
 * @author makejava
 * @since 2021-06-05 21:39:47
 */
@Service("warehouseService")
public class WarehouseServiceImpl implements WarehouseService {
    @Resource
    private WarehouseDao warehouseDao;

    @Override
    public List<Warehouse> queryBybranId(Integer branchid) {
        return this.warehouseDao.queryBybranchid(branchid);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param wid 主键
     * @return 实例对象
     */
    @Override
    public Warehouse queryById(Integer wid) {
        return this.warehouseDao.queryById(wid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Warehouse> queryAllByLimit(int offset, int limit) {
        return this.warehouseDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param warehouse 实例对象
     * @return 实例对象
     */
    @Override
    public Warehouse insert(Warehouse warehouse) {
        this.warehouseDao.insert(warehouse);
        return warehouse;
    }

    /**
     * 修改数据
     *
     * @param warehouse 实例对象
     * @return 实例对象
     */
    @Override
    public Warehouse update(Warehouse warehouse) {
        this.warehouseDao.update(warehouse);
        return this.queryById(warehouse.getWid());
    }

    /**
     * 通过主键删除数据
     *
     * @param wid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer wid) {
        return this.warehouseDao.deleteById(wid) > 0;
    }
}
