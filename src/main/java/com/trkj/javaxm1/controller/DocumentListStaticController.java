package com.trkj.javaxm1.controller;

import com.trkj.javaxm1.mybatis.entity.DocumentListStatic;
import com.trkj.javaxm1.service.DocumentListStaticService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DocumentListStatic)表控制层
 *
 * @author makejava
 * @since 2021-06-07 11:38:11
 */
@RestController
@RequestMapping("documentListStatic")
public class DocumentListStaticController {
    /**
     * 服务对象
     */
    @Resource
    private DocumentListStaticService documentListStaticService;



}
