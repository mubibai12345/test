package com.trkj.javaxm1.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.trkj.javaxm1.mybatis.entity.ShopType;


import java.util.List;

/**
 * (Shoptype)表数据库访问层
 *
 * @author makejava
 * @since 2021-05-19 16:37:56
 */
@Mapper
public interface ShoptypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param shoptypeid 主键
     * @return 实例对象
     */
    ShopType queryById(Integer shoptypeid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ShopType> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 查询所有商品类型
     * @return
     */
    List<ShopType> queryTypeAll();

    /**
     * 通过实体作为筛选条件查询
     *
     * @param shoptype 实例对象
     * @return 对象列表
     */
    List<ShopType> queryAll(ShopType shoptype);

    /**
     * 新增数据
     *
     * @param shoptype 实例对象
     * @return 影响行数
     */
    int insert(ShopType shoptype);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Shoptype> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ShopType> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Shoptype> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<ShopType> entities);

    /**
     * 修改数据
     *
     * @param shoptype 实例对象
     * @return 影响行数
     */
    int update(ShopType shoptype);

    /**
     * 通过主键删除数据
     *
     * @param shoptypeid 主键
     * @return 影响行数
     */
    int deleteById(Integer shoptypeid);

}

