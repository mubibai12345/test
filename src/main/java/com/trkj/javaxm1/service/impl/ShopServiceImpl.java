package com.trkj.javaxm1.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.javaxm1.mybatis.dao.ShopDao;
import com.trkj.javaxm1.mybatis.entity.Shop;
import com.trkj.javaxm1.service.ShopService;
import com.trkj.javaxm1.util.BeanTools;
import com.trkj.javaxm1.vo.ShopVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Shop)表服务实现类
 *
 * @author makejava
 * @since 2021-05-19 16:33:10
 */
@Service("shopService")
public class ShopServiceImpl implements ShopService {
    @Resource
    private ShopDao shopDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Shop queryById(Integer id) {
        return this.shopDao.queryById(id);
    }

    /**
     * 分页查询所有商品
     * @param currentPage
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<ShopVo> queryAllByPage(int currentPage, int pageSize) {
        System.out.println(currentPage);
        Page<Shop> page= PageHelper.startPage(currentPage,pageSize,true);
        List<Shop> list=shopDao.queryAllByPage();
        List<ShopVo> vos=new ArrayList<>();
        BeanTools.copyList(list,vos, ShopVo.class);
        PageInfo<ShopVo> info=new PageInfo<>(vos);
        info.setTotal((long)this.shopDao.queryCount());
        return info;
    }

    @Override
    public Integer queryCount() {
        int count = this.shopDao.queryCount();
        System.out.println("8888888888888888888888    :"+count);
        return count;
    }
    /**
     * 关键字查询
     * @param shopname
     * @param currentPage
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<ShopVo> queryBytypeLike (String shopname,String shoptypename,Integer shopstatic,Integer currentPage, Integer pageSize) {
        List<Shop> list1=this.shopDao.queryBytypelike(shopname,shoptypename,shopstatic);
        System.out.println(list1.size()+"---------------");
        Page<Shop> page= PageHelper.startPage(currentPage,pageSize,true);
        List<Shop> list=this.shopDao.queryBytypelike(shopname,shoptypename,shopstatic);
        List<ShopVo> vos = new ArrayList<>();
        BeanTools.copyList(list,vos,ShopVo.class);
        PageInfo<ShopVo> info = new PageInfo<>(vos);
        info.setTotal((long)list1.size());
        for(Shop shop1:list1) {
            System.out.println(shop1);
        }
        System.out.println("88888888888888888888888888888888888888     :"+this.shopDao.selectCount(shopname));

        return info;
    }

    @Override
    public Integer selectCount(String shopname) {
        int count = this.shopDao.selectCount(shopname);
        System.out.println("8888888888888888888888    :"+count);
        return count;
    }



    @Override
    public PageInfo<ShopVo> queryAllByType(Integer shopstatic,String shopname,String shoptypename,Integer currentPage, Integer pageSize) {
        List<Shop> list1=this.shopDao.queryAllByType(shoptypename,shopname,shopstatic);
        System.out.println(list1.size()+"---------------");
        Page<Shop> page= PageHelper.startPage(currentPage,pageSize,true);
        List<Shop> list=this.shopDao.queryAllByType(shoptypename,shopname,shopstatic);
        return getShopVoPageInfo(list1, list);
    }

    /**
     * 根据商品id批量禁用商品
     * @param list
     * @return
     */
    @Override
    public Integer updatePil(Integer[] list) {
        System.out.println(list.toString());
        return this.shopDao.updatePil(list);
    }

    /**
     * 根据商品id单个禁用商品
     * @param shopid
     * @return
     */
    @Override
    public Integer updateStatic(Integer shopid) {
        System.out.println(shopid);

        return this.shopDao.updateStatic(shopid);
    }
    /**
     * 根据商品id单个启用商品
     * @param shopid
     * @return
     */
    @Override
    public Integer updateStatic2(Integer shopid) {
        return this.shopDao.updateStatic2(shopid);
    }

    /**
     * 批量删除
     * @param shopid
     * @return
     */
    @Override
    public Integer delShop(Integer[] shopid) {
        return shopDao.delShop(shopid);
    }

    @Override
    public List<Shop> findshopname(String shopname) {
        return this.shopDao.findAllByShopName(shopname);
    }

    /**
     * 新增商品
     * @param shop
     * @return
     */
    @Override
    public Boolean insertShop(Shop shop) {
        List<Shop> shopname = findshopname(shop.getSpName());
        if(shopname.size()>0){
            return false;
        }
        this.shopDao.insertShop(shop);
        return true;
    }

    /**
     * 修改商品
     * @param shop
     * @return
     */
    @Override
    public Boolean updateshop(Shop shop) {
        List<Shop> shopname = findshopname(shop.getSpName());
        if(shopname.size() > 0){
            return false;
        }
        this.shopDao.updateshop(shop);
        return true;
    }

    @Override
    public PageInfo<ShopVo> queryAllBySatic(Integer shopstatic,String shopname,String shoptypename,Integer currentPage, Integer pageSize) {
        List<Shop> list1=this.shopDao.queryAllByStatic(shopstatic,shopname,shoptypename);
        System.out.println(list1.size()+"---------------");
        Page<Shop> page= PageHelper.startPage(currentPage,pageSize,true);
        List<Shop> list=this.shopDao.queryAllByStatic(shopstatic,shopname,shoptypename);
        return getShopVoPageInfo(list1, list);
    }

    private PageInfo<ShopVo> getShopVoPageInfo(List<Shop> list1, List<Shop> list) {
        List<ShopVo> vos = new ArrayList<>();
        BeanTools.copyList(list,vos,ShopVo.class);
        PageInfo<ShopVo> info = new PageInfo<>(vos);
        info.setTotal((long)list1.size());
        return info;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
//    @Override
//    public List<Shop> queryAllByLimit() {
//        return this.shopDao.queryAllByLimit();
//    }
//
//    @Override
//    public List<Shop> queryall() {
//
//        return this.shopDao.queryAlls();
//    }
//
//
//    /**
//     * 新增数据
//     *
//     * @param shop 实例对象
//     * @return 实例对象
//     */
//    @Override
//    public Shop insert(Shop shop) {
//        this.shopDao.insert(shop);
//        return shop;
//    }
//
//    /**
//     * 修改数据
//     *
//     * @param shop 实例对象
//     * @return 实例对象
//     */
//    @Override
//    public Shop update(Shop shop) {
//        this.shopDao.update(shop);
//        return this.queryById(shop.getId());
//    }
//
//    /**
//     * 通过主键删除数据
//     *
//     * @param id 主键
//     * @return 是否成功
//     */
//    @Override
//    public boolean deleteById(Integer id) {
//        return this.shopDao.deleteById(id) > 0;
//    }
//

}
