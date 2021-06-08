package com.trkj.javaxm1.controller;

import com.github.pagehelper.PageInfo;
import com.trkj.javaxm1.mybatis.entity.Stock;
import com.trkj.javaxm1.service.StockService;
import com.trkj.javaxm1.vo.AjaxResponse;
import com.trkj.javaxm1.vo.StockVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Stock)表控制层
 *
 * @author makejava
 * @since 2021-06-06 03:04:25
 */
@RestController
@RequestMapping("stock")
public class StockController {
    /**
     * 服务对象
     */
    @Resource
    private StockService stockService;

//    /**
//     * 通过主键查询单条数据
//     *
//     * @param id 主键
//     * @return 单条数据
//     */
//    @GetMapping("selectOne")
//    public Stock selectOne(id) {
//        return this.stockService.queryById(id);
//    }

    /**
     * 根据分店id查询库存商品加分页
     * @param value
     * @param currentPage
     * @param pageSize
     * @return
     */
    @GetMapping("findallbybranchid")
    public AjaxResponse findall(Integer value,int currentPage, int pageSize ){
        PageInfo<StockVo> info = stockService.selectbybranchid(value,currentPage,pageSize);
        return AjaxResponse.success(info);
    }
    /**
     * 根据商品类型以及关键字查询库存商品加分页
     * @return
     */
    @GetMapping("findallbylike")
    public AjaxResponse findall2(String stockade,int currentPage, int pageSize ){
        System.out.println("    "+stockade);
        PageInfo<StockVo> info = stockService.findallbytypeandlike(stockade,currentPage,pageSize);
        return AjaxResponse.success(info);
    }


}
