package com.trkj.javaxm1.controller;

import com.github.pagehelper.PageInfo;
import com.trkj.javaxm1.mybatis.entity.Shop;
import com.trkj.javaxm1.service.ShopService;
import com.trkj.javaxm1.vo.AjaxResponse;
import com.trkj.javaxm1.vo.ShopVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Shop)表控制层
 *
 * @author makejava
 * @since 2021-05-19 16:33:11
 */
@RestController
@RequestMapping("shop")
public class ShopController {
    /**
     * 服务对象
     */
    @Resource
    private ShopService shopService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Shop selectOne(Integer id) {
        return this.shopService.queryById(id);
    }
//    @GetMapping("selectAll")
//    public List<Shop> seelctall(){
//        return this.shopService.queryall();
//    }
//

    /**
     * 查询所有加分页
     * @param currentPage
     * @param pageSize
     * @return
     */
    @GetMapping("page")
    public AjaxResponse pageshop(int currentPage, int pageSize){
        System.out.println(currentPage+"------------");
        PageInfo<ShopVo> page = this.shopService.queryAllByPage(currentPage,pageSize);
        return AjaxResponse.success(page);

    }
    @GetMapping("count")
    public Integer count(){
        return this.shopService.queryCount();
    }

    /**
     * 关键字模糊查询加分页
     * @param currentPage
     * @param pageSize
     * @param shopname
     * @return
     */
    @GetMapping("like")
    public AjaxResponse shoplike(Integer currentPage,Integer pageSize,@Param("shopname") String shopname,String shoptypename,Integer shopstatic){
        System.out.println(shopname+"--------shopname------");
       PageInfo<ShopVo> shop1= this.shopService.queryBytypeLike(shopname,shoptypename,shopstatic,currentPage,pageSize);
        return AjaxResponse.success(shop1);
    }

    /**
     * 根据商品类型查询加分页
     * @param currentPage
     * @param pageSize
     * @param shoptypename
     * @return
     */
    @GetMapping("type")
    public AjaxResponse findtype(Integer currentPage,Integer pageSize,@Param("shoptypename") String shoptypename,@Param("shopname") String shopname,Integer shopstatic){
        PageInfo<ShopVo> shop = this.shopService.queryAllByType(shopstatic,shopname,shoptypename,currentPage,pageSize);
        return AjaxResponse.success(shop);
    }

    /**
     * 根据商品状态查询加分页
     * @param currentPage
     * @param pageSize
     * @param shopstatic
     * @return
     */
    @GetMapping("static")
    public AjaxResponse findstatic(Integer currentPage,Integer pageSize,@Param("shopstatic") Integer shopstatic,String shoptypename,@Param("shopname")String shopname){
        PageInfo<ShopVo> shop = this.shopService.queryAllBySatic(shopstatic,shoptypename,shopname,currentPage,pageSize);
        return AjaxResponse.success(shop);
    }

    @GetMapping("jinyons")
    public Integer updateshopstatic(@RequestParam(value = "shopids")Integer[] shopid){
       // Integer[] shopid2={12224,12225};
        //System.out.println(shopid2);
        return this.shopService.updatePil(shopid);
    }

    @GetMapping("jinyon")
    public Integer updatestatic(Integer shopid){
        return this.shopService.updateStatic(shopid);
    }
    @GetMapping("jinyon2")
    public Integer updatestatic2(Integer shopid){
        return this.shopService.updateStatic2(shopid);
    }

    /**
     * 批量删除
     * @param shopid
     * @return
     */
    @GetMapping("delshop")
    public Integer delshop(@RequestParam(value = "shopid") Integer[] shopid){
        return this.shopService.delShop(shopid);
    }

    @PostMapping("addshop")
    public Boolean addshop(@RequestBody Shop shop){
        return this.shopService.insertShop(shop);
    }
    @PostMapping("setshop")
    public Boolean setshop(@RequestBody Shop shop){
        return this.shopService.updateshop(shop);
    }


}
