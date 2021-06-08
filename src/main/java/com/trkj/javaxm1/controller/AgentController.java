package com.trkj.javaxm1.controller;

import com.trkj.javaxm1.mybatis.entity.Agent;
import com.trkj.javaxm1.service.AgentService;
import com.trkj.javaxm1.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Agent)表控制层
 *
 * @author makejava
 * @since 2021-06-06 01:35:37
 */
@RestController
@RequestMapping("agent")
public class AgentController {
    /**
     * 服务对象
     */
    @Resource
    private AgentService agentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Agent selectOne(Integer id) {
        return this.agentService.queryById(id);
    }

    @GetMapping("selectbyall")
    public AjaxResponse selectbyid(Integer id){
        List<Agent> list = agentService.selectallbybranchid(id);
        return AjaxResponse.success(list);
    }

}
