package com.trkj.javaxm1.service.impl;

import com.trkj.javaxm1.mybatis.entity.Agent;
import com.trkj.javaxm1.mybatis.dao.AgentDao;
import com.trkj.javaxm1.service.AgentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Agent)表服务实现类
 *
 * @author makejava
 * @since 2021-06-06 01:35:37
 */
@Service("agentService")
public class AgentServiceImpl implements AgentService {
    @Resource
    private AgentDao agentDao;

    @Override
    public List<Agent> selectallbybranchid(Integer branchid) {
        return agentDao.selectallbybranchid(branchid);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Agent queryById(Integer id) {
        return this.agentDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Agent> queryAllByLimit(int offset, int limit) {
        return this.agentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param agent 实例对象
     * @return 实例对象
     */
    @Override
    public Agent insert(Agent agent) {
        this.agentDao.insert(agent);
        return agent;
    }

    /**
     * 修改数据
     *
     * @param agent 实例对象
     * @return 实例对象
     */
    @Override
    public Agent update(Agent agent) {
        this.agentDao.update(agent);
        return this.queryById(agent.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.agentDao.deleteById(id) > 0;
    }
}
