package com.trkj.javaxm1.controller;

import com.trkj.javaxm1.mybatis.entity.DocumentListType;
import com.trkj.javaxm1.service.DocumentListTypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DocumentListType)表控制层
 *
 * @author makejava
 * @since 2021-06-07 13:51:50
 */
@RestController
@RequestMapping("documentListType")
public class DocumentListTypeController {
    /**
     * 服务对象
     */
    @Resource
    private DocumentListTypeService documentListTypeService;



}
