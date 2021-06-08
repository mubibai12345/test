package com.trkj.javaxm1.service;

import com.trkj.javaxm1.mybatis.entity.ShopType;

import java.util.List;

/**
 * (Shoptype)表服务接口
 *
 * @author makejava
 * @since 2021-05-19 16:37:56
 */
public interface ShoptypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param shoptypeid 主键
     * @return 实例对象
     */
    ShopType queryById(Integer shoptypeid);

    List<ShopType> queryTypeAll();

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ShopType> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param shoptype 实例对象
     * @return 实例对象
     */
    Integer insert(ShopType shoptype);

    /**
     * 修改数据
     *
     * @param shoptype 实例对象
     * @return 实例对象
     */
    Integer update(ShopType shoptype);

    /**
     * 通过主键删除数据
     *
     * @param shoptypeid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer shoptypeid);

}
