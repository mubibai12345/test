package com.trkj.javaxm1.service.impl;

import com.trkj.javaxm1.mybatis.dao.ShoptypeDao;
import com.trkj.javaxm1.mybatis.entity.ShopType;
import com.trkj.javaxm1.service.ShoptypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Shoptype)表服务实现类
 *
 * @author makejava
 * @since 2021-05-19 16:37:56
 */
@Service("shoptypeService")
public class ShoptypeServiceImpl implements ShoptypeService {
    @Resource
    private ShoptypeDao shoptypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param shoptypeid 主键
     * @return 实例对象
     */
    @Override
    public ShopType queryById(Integer shoptypeid) {
        return this.shoptypeDao.queryById(shoptypeid);
    }

    /**
     * 查询所有商品类型
     * @return
     */
    @Override
    public List<ShopType> queryTypeAll() {
        return this.shoptypeDao.queryTypeAll();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<ShopType> queryAllByLimit(int offset, int limit) {
        return this.shoptypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param shoptype 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(ShopType shoptype) {

        return this.shoptypeDao.insert(shoptype);
    }

    /**
     * 修改数据
     *
     * @param shoptype 实例对象
     * @return 实例对象
     */
    @Override
    public Integer update(ShopType shoptype) {

        return this.shoptypeDao.update(shoptype);
    }

    /**
     * 通过主键删除数据
     *
     * @param shoptypeid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer shoptypeid) {
        return this.shoptypeDao.deleteById(shoptypeid) > 0; 
    }
}
