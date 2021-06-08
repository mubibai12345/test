package com.trkj.javaxm1.service;

import com.trkj.javaxm1.mybatis.entity.Establishment;

import java.util.List;

/**
 * (Establishment)表服务接口
 *
 * @author makejava
 * @since 2021-06-06 02:29:53
 */
public interface EstablishmentService {
    List<Establishment> selectbybranchid(Integer branchid);
    /**
     * 通过ID查询单条数据
     *
     * @param xid 主键
     * @return 实例对象
     */
    Establishment queryById(Integer xid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Establishment> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param establishment 实例对象
     * @return 实例对象
     */
    Establishment insert(Establishment establishment);

    /**
     * 修改数据
     *
     * @param establishment 实例对象
     * @return 实例对象
     */
    Establishment update(Establishment establishment);

    /**
     * 通过主键删除数据
     *
     * @param xid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer xid);

}
