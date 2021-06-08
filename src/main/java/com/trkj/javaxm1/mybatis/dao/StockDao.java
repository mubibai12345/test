package com.trkj.javaxm1.mybatis.dao;

import com.trkj.javaxm1.mybatis.entity.Stock;
import com.trkj.javaxm1.vo.StockVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Stock)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-06 03:03:48
 */
@Mapper
public interface StockDao {

    List<StockVo> findallbytypeandlike( @Param("nameandid") String nameandid);
    List<StockVo> queryshopanstock(Integer value);
    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    Stock queryById();

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Stock> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param stock 实例对象
     * @return 对象列表
     */
    List<Stock> queryAll(Stock stock);

    /**
     * 新增数据
     *
     * @param stock 实例对象
     * @return 影响行数
     */
    int insert(Stock stock);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Stock> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Stock> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Stock> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Stock> entities);

    /**
     * 修改数据
     *
     * @param stock 实例对象
     * @return 影响行数
     */
    int update(Stock stock);

    /**
     * 通过主键删除数据
     *
     * @param
     * @return 影响行数
     */
    int deleteById();

}

