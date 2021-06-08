package com.trkj.javaxm1.service.impl;

import com.trkj.javaxm1.mybatis.entity.Establishment;
import com.trkj.javaxm1.mybatis.dao.EstablishmentDao;
import com.trkj.javaxm1.service.EstablishmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Establishment)表服务实现类
 *
 * @author makejava
 * @since 2021-06-06 02:29:54
 */
@Service("establishmentService")
public class EstablishmentServiceImpl implements EstablishmentService {
    @Resource
    private EstablishmentDao establishmentDao;

    @Override
    public List<Establishment> selectbybranchid(Integer branchid) {
        return establishmentDao.selectbybranchid(branchid);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param xid 主键
     * @return 实例对象
     */
    @Override
    public Establishment queryById(Integer xid) {
        return this.establishmentDao.queryById(xid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Establishment> queryAllByLimit(int offset, int limit) {
        return this.establishmentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param establishment 实例对象
     * @return 实例对象
     */
    @Override
    public Establishment insert(Establishment establishment) {
        this.establishmentDao.insert(establishment);
        return establishment;
    }

    /**
     * 修改数据
     *
     * @param establishment 实例对象
     * @return 实例对象
     */
    @Override
    public Establishment update(Establishment establishment) {
        this.establishmentDao.update(establishment);
        return this.queryById(establishment.getXid());
    }

    /**
     * 通过主键删除数据
     *
     * @param xid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer xid) {
        return this.establishmentDao.deleteById(xid) > 0;
    }
}
