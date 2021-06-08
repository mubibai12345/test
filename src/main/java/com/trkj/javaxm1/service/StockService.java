package com.trkj.javaxm1.service;

import com.github.pagehelper.PageInfo;
import com.trkj.javaxm1.mybatis.entity.Stock;
import com.trkj.javaxm1.vo.StockVo;

import java.util.List;

/**
 * (Stock)表服务接口
 *
 * @author makejava
 * @since 2021-06-06 03:04:24
 */
public interface StockService {
    PageInfo<StockVo> findallbytypeandlike(String nameandid,int currentPage, int pageSize);
    /**
     * 根据分店i的外键查询所有
     * @param value
     * @return
     */
    PageInfo<StockVo> selectbybranchid(Integer value,int currentPage, int pageSize );
    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    Stock queryById();

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Stock> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param stock 实例对象
     * @return 实例对象
     */
    Stock insert(Stock stock);

    /**
     * 修改数据
     *
     * @param stock 实例对象
     * @return 实例对象
     */
    int update(Stock stock);

    /**
     * 通过主键删除数据
     *
     * @param
     * @return 是否成功
     */
    boolean deleteById();

}
