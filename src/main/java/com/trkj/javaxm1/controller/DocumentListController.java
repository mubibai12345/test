package com.trkj.javaxm1.controller;

import com.github.pagehelper.PageInfo;
import com.trkj.javaxm1.mybatis.entity.DocumentList;
import com.trkj.javaxm1.mybatis.entity.DocumentShop;
import com.trkj.javaxm1.mybatis.entity.Stock;
import com.trkj.javaxm1.service.DocumentListService;
import com.trkj.javaxm1.service.DocumentShopService;
import com.trkj.javaxm1.service.StockService;
import com.trkj.javaxm1.vo.AjaxResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.trkj.javaxm1.vo.DocumentlistVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * (DocumentList)表控制层
 *
 * @author makejava
 * @since 2021-06-07 11:09:32
 */
@RestController
@RequestMapping("documentList")
public class DocumentListController {
    /**
     * 服务对象
     */
    @Resource
    private DocumentListService documentListService;
    @Resource
    private DocumentShopService documentShopService;
    @Resource
    private StockService stockService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DocumentList selectOne(Integer id) {
        return this.documentListService.queryById(id);
    }

    /**
     * KK:添加到单据表和单据详情表
     * @param www
     * @param i
     * @return
     */
    @PostMapping("adddocument/{i}")
    public AjaxResponse adddocument(@RequestBody String www,@PathVariable("i") int i){
        JSONObject jsonObject = JSONObject.parseObject(www);
        String ww = jsonObject.getString("sss");
        DocumentList list = JSON.parseObject(ww,DocumentList.class);

        System.out.println(list);
        this.documentListService.insert(list);
        String ss = jsonObject.getString("list");
        List<DocumentShop> list2 = JSON.parseArray(ss,DocumentShop.class);
        if(i == 2){
            Stock stock = new Stock();
            for (int a=0;a<list2.size();a++){
                stock.setSkShopid(list2.get(a).getSpShopid());
                stock.setSkNumber(list2.get(a).getNumber());
                stock.setSkLossNumber(list2.get(a).getLossNumber());
                this.stockService.update(stock);
            }
        }
        this.documentShopService.insertBatch(list2);

        return AjaxResponse.success("销售成功");
    }

    /**
     * kk:多条件查询销售审核单
     * @param branchid
     * @param customerid
     * @param userid
     * @param gjz
     * @param currentPage
     * @param pageSize
     * @return
     */
    @GetMapping("findallbytj")
    public AjaxResponse findalltj(int branchid, int customerid, int userid, String gjz, int currentPage, int pageSize){
        System.out.println(branchid+"      "+customerid+"       "+userid+"   "+gjz+"  "+currentPage+"  "+pageSize);
        PageInfo<DocumentlistVo> info = documentListService.findallbyfdandkhanduserandgjz(branchid,customerid,userid,gjz,currentPage,pageSize);
        System.out.println(info);
        return AjaxResponse.success(info);
    }


}
