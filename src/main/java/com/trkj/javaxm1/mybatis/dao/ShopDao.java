package com.trkj.javaxm1.mybatis.dao;

import com.trkj.javaxm1.mybatis.entity.Shop;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Shop)表数据库访问层
 *
 * @author makejava
 * @since 2021-05-19 16:33:09
 */
@Mapper
public interface ShopDao {

    /**
     * 通过ID查询单条数据
     *
     * @param spid 主键
     * @return 实例对象
     */
    Shop queryById(Integer spid);

    /**
     * 可通过分页插件查询信息
     * @return
     */
    List<Shop> queryAllByPage();

    Integer queryCount();

    /**
     * 关键字查询
     * @param shopname
     * @return
     */
    List<Shop> queryBytypelike(@Param("shopname") String shopname,@Param("shoptypename")String shoptypename,@Param("shopstatic") int shopstatic);

    Integer selectCount(@Param("shopname") String shopname);

    List<Shop> queryAllByType(@Param("shoptypename") String shoptypename,@Param("shopname") String shopname,@Param("shopstatic") int shopstatic);
    //禁用
    Integer updateStatic(@Param("shopid") Integer shopid);

    Integer updatePil(@Param("listid")Integer[] listid);
    //启用
    Integer updateStatic2(@Param("shopid")Integer shopid);
    /**
     * 根据商品状态查询
     * @param shopstatic
     * @return
     */
    List<Shop> queryAllByStatic(@Param("shopstatic") int shopstatic,@Param("shoptypename")String shoptypename,@Param("shopname")String shopname);

    /**
     * 批量删除
     * @param shopid
     * @return
     */
    Integer delShop(@Param("shopid") Integer[] shopid);

    List<Shop> findAllByShopName(@Param("shopname") String shopname);

    /**
     * 新增商品
     * @param shop
     * @return
     */
    Integer insertShop(Shop shop);

    Integer updateshop(Shop shop);
//    List<Shop> queryAllByLimit();
//
//
//    List<Shop> queryAlls();
//
//
//    /**
//     * 通过实体作为筛选条件查询
//     *
//     * @param shop 实例对象
//     * @return 对象列表
//     */
//    List<Shop> queryAll(Shop shop);
//
//    /**
//     * 新增数据
//     *
//     * @param shop 实例对象
//     * @return 影响行数
//     */
//    int insert(Shop shop);
//
//    /**
//     * 批量新增数据（MyBatis原生foreach方法）
//     *
//     * @param entities List<Shop> 实例对象列表
//     * @return 影响行数
//     */
//    int insertBatch(@Param("entities") List<Shop> entities);
//
//    /**
//     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
//     *
//     * @param entities List<Shop> 实例对象列表
//     * @return 影响行数
//     */
//    int insertOrUpdateBatch(@Param("entities") List<Shop> entities);
//
//    /**
//     * 修改数据
//     *
//     * @param shop 实例对象
//     * @return 影响行数
//     */
//    int update(Shop shop);
//
//    /**
//     * 通过主键删除数据
//     *
//     * @param id 主键
//     * @return 影响行数
//     */
//    int deleteById(Integer id);
//


}

