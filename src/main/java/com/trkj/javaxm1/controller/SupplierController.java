package com.trkj.javaxm1.controller;

import com.github.pagehelper.PageInfo;
import com.trkj.javaxm1.mybatis.entity.Supplier;
import com.trkj.javaxm1.service.SupplierService;
import com.trkj.javaxm1.vo.AjaxResponse;
import com.trkj.javaxm1.vo.SupplierVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("supplier")
public class SupplierController {
    @Resource
    private SupplierService supplierService;

    @GetMapping("findall")
    public AjaxResponse findall(Integer currentPage,Integer pageSize){
        PageInfo<SupplierVo> info = supplierService.findAllPage(currentPage,pageSize);
        return AjaxResponse.success(info);
    }

    /**
     * 根据门店类型以及关键字查询的分页
     * @param branchnames
     * @param suppliername
     * @param currentPage
     * @param pageSize
     * @return
     */
    @GetMapping("findguanjz")
    public AjaxResponse findbyname(String branchnames,String suppliername,Integer currentPage,Integer pageSize){
        System.out.println("------------------"+branchnames);
        PageInfo<SupplierVo> info = supplierService.findAllByName(branchnames,suppliername,currentPage,pageSize);
        return AjaxResponse.success(info);
    }

    @PostMapping("addsupplier")
    public Integer addsupplier(@RequestBody Supplier supplier){
        System.out.println(supplier.toString());
        return supplierService.addsupplier(supplier);
    }
    @PostMapping("upsupplier")
    public Integer upsupplier(@RequestBody Supplier supplier){
        System.out.println(supplier.toString());
        return supplierService.upsupplier(supplier);
    }
    @GetMapping("delsupplier")
    public Integer delsupplier(@RequestParam(value = "supplierid")Integer[] supplierid){
        return supplierService.deletepl(supplierid);
    }
}
