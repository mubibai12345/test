package com.trkj.javaxm1.controller;

import com.trkj.javaxm1.mybatis.entity.Establishment;
import com.trkj.javaxm1.service.EstablishmentService;
import com.trkj.javaxm1.vo.AjaxResponse;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Establishment)表控制层
 *
 * @author makejava
 * @since 2021-06-06 02:29:54
 */
@RestController
@RequestMapping("establishment")
public class EstablishmentController {
    /**
     * 服务对象
     */
    @Resource
    private EstablishmentService establishmentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Establishment selectOne(Integer id) {
        return this.establishmentService.queryById(id);
    }

    /**
     * 根据分店查询所有的银行账户
     */
    @GetMapping("selectbyid")
    public AjaxResponse selectbyid(Integer id){
        List<Establishment> list = establishmentService.selectbybranchid(id);
        return AjaxResponse.success(list);
    }

}
