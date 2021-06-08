package com.trkj.javaxm1.service;

import com.github.pagehelper.PageInfo;
import com.trkj.javaxm1.mybatis.entity.Shop;
import com.trkj.javaxm1.vo.ShopVo;

import java.util.List;

/**
 * (Shop)表服务接口
 *
 * @author makejava
 * @since 2021-05-19 16:33:09
 */

public interface ShopService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Shop queryById(Integer id);

    /**
     * 可通过分页插件查询信息
     * @return
     */
    public PageInfo<ShopVo> queryAllByPage(int currentPage, int pageSize) ;

    public Integer queryCount();

    /**
     * 关键字查询
     * @param shopname
     * @param currentPage
     * @param pageSize
     * @return
     */
    public PageInfo<ShopVo> queryBytypeLike(String shopname,String shoptypename,Integer shopstatic,Integer currentPage, Integer pageSize);
    public Integer selectCount(String shopname);
    public PageInfo<ShopVo> queryAllBySatic(Integer shopstatic,String shopname,String shoptypename,Integer currentPage, Integer pageSize);
    public PageInfo<ShopVo> queryAllByType(Integer shopstatic,String shopname,String shoptypename,Integer currentPage, Integer pageSize);

    /**
     * 批量禁用商品状态
     * @param list
     * @return
     */
    public Integer updatePil(Integer[] list);
    public Integer updateStatic(Integer shopid);
    public Integer updateStatic2(Integer shopid);

    /**
     * 批量删除
     * @param shopid
     * @return
     */
    public Integer delShop(Integer[] shopid);

    public List<Shop> findshopname(String shopname);

    /**
     * 新增商品
     * @param shop
     * @return
     */
    public Boolean insertShop(Shop shop);

    /**
     * 修改商品
     * @param shop
     * @return
     */
     public Boolean updateshop(Shop shop);



}
