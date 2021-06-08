package com.trkj.javaxm1.controller;

import com.trkj.javaxm1.mybatis.entity.DocumentShop;
import com.trkj.javaxm1.service.DocumentShopService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DocumentShop)表控制层
 *
 * @author makejava
 * @since 2021-06-07 13:52:24
 */
@RestController
@RequestMapping("documentShop")
public class DocumentShopController {
    /**
     * 服务对象
     */
    @Resource
    private DocumentShopService documentShopService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DocumentShop selectOne(Integer id) {
        return this.documentShopService.queryById(id);
    }

}
