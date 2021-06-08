package com.trkj.javaxm1.controller;

import com.trkj.javaxm1.mybatis.entity.ShopType;
import com.trkj.javaxm1.service.ShoptypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Shoptype)表控制层
 *
 * @author makejava
 * @since 2021-05-19 16:37:57
 */
@RestController
@RequestMapping("shoptype")
public class ShoptypeController {
    /**
     * 服务对象
     */
    @Resource
    private ShoptypeService shoptypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ShopType selectOne(Integer id) {
        return this.shoptypeService.queryById(id);
    }

    @GetMapping("selecttypeall")
    public List<ShopType> selecttypeall(){
        return this.shoptypeService.queryTypeAll();
    }

    @PostMapping("addtype")
    public Integer addtype(@RequestBody ShopType shopType){
        return this.shoptypeService.insert(shopType);
    }
    @PostMapping("settype")
    public Integer settype(@RequestBody ShopType shopType){
        return this.shoptypeService.update(shopType);
    }
    @GetMapping("deltype")
    public Boolean deltype(Integer spTypeId){
        return this.shoptypeService.deleteById(spTypeId);
    }

}
