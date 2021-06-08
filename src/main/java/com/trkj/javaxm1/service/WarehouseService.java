package com.trkj.javaxm1.service;

import com.trkj.javaxm1.mybatis.entity.Warehouse;

import java.util.List;

/**
 * (Warehouse)表服务接口
 *
 * @author makejava
 * @since 2021-06-05 21:39:46
 */
public interface WarehouseService {

    List<Warehouse> queryBybranId(Integer branchid);
    /**
     * 通过ID查询单条数据
     *
     * @param wid 主键
     * @return 实例对象
     */
    Warehouse queryById(Integer wid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Warehouse> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param warehouse 实例对象
     * @return 实例对象
     */
    Warehouse insert(Warehouse warehouse);

    /**
     * 修改数据
     *
     * @param warehouse 实例对象
     * @return 实例对象
     */
    Warehouse update(Warehouse warehouse);

    /**
     * 通过主键删除数据
     *
     * @param wid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer wid);

}
