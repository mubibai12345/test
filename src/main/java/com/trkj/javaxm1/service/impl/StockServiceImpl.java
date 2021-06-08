package com.trkj.javaxm1.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.javaxm1.mybatis.entity.Stock;
import com.trkj.javaxm1.mybatis.dao.StockDao;
import com.trkj.javaxm1.service.StockService;
import com.trkj.javaxm1.vo.StockVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Stock)表服务实现类
 *
 * @author makejava
 * @since 2021-06-06 03:04:24
 */
@Service("stockService")
public class StockServiceImpl implements StockService {
    @Resource
    private StockDao stockDao;

    /**
     * 根据商品类型以及关键字查询
     */
    @Override
    public PageInfo<StockVo> findallbytypeandlike( String nameandid, int currentPage, int pageSize) {
        List<StockVo> list = stockDao.findallbytypeandlike(nameandid);
        Page<StockVo> page = PageHelper.startPage(currentPage,pageSize,true);
        List<StockVo> list2 = stockDao.findallbytypeandlike(nameandid);
        PageInfo<StockVo> info = new PageInfo<>(list2);
        info.setTotal(list.size());
        return info;
    }

    /**
     * 根据商品类型查询分页
     * @param
     * @param currentPage
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<StockVo> selectbybranchid(Integer value,int currentPage, int pageSize) {
        List<StockVo> list = stockDao.queryshopanstock(value);
        Page<StockVo> page = PageHelper.startPage(currentPage,pageSize,true);
        List<StockVo> list2 = stockDao.queryshopanstock(value);
        PageInfo<StockVo> info = new PageInfo<>(list2);
        info.setTotal(list.size());
        return info;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    @Override
    public Stock queryById() {
        return this.stockDao.queryById();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Stock> queryAllByLimit(int offset, int limit) {
        return this.stockDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param stock 实例对象
     * @return 实例对象
     */
    @Override
    public Stock insert(Stock stock) {
        this.stockDao.insert(stock);
        return stock;
    }

    @Override
    public int update(Stock stock) {
        return this.stockDao.update(stock);
    }


    /**
     * 通过主键删除数据
     *
     * @param
     * @return 是否成功
     */
    @Override
    public boolean deleteById() {
        return this.stockDao.deleteById() > 0;
    }
}
