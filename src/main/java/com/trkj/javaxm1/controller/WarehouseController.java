package com.trkj.javaxm1.controller;

import com.trkj.javaxm1.mybatis.entity.Warehouse;
import com.trkj.javaxm1.service.WarehouseService;
import com.trkj.javaxm1.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Warehouse)表控制层
 *
 * @author makejava
 * @since 2021-06-05 21:39:47
 */
@RestController
@RequestMapping("warehouse")
public class WarehouseController {
    /**
     * 服务对象
     */
    @Resource
    private WarehouseService warehouseService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Warehouse selectOne(Integer id) {
        return this.warehouseService.queryById(id);
    }
    @GetMapping("selectone")
    public AjaxResponse selectones(Integer id){
        List<Warehouse> wa = this.warehouseService.queryBybranId(id);
        return AjaxResponse.success(wa);
    }

}
