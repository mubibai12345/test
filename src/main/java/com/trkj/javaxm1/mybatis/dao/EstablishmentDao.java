package com.trkj.javaxm1.mybatis.dao;

import com.trkj.javaxm1.mybatis.entity.Establishment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Establishment)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-06 02:29:37
 */
@Mapper
public interface EstablishmentDao {

    List<Establishment> selectbybranchid(Integer branchid);
    /**
     * 通过ID查询单条数据
     *
     * @param xid 主键
     * @return 实例对象
     */
    Establishment queryById(Integer xid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Establishment> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param establishment 实例对象
     * @return 对象列表
     */
    List<Establishment> queryAll(Establishment establishment);

    /**
     * 新增数据
     *
     * @param establishment 实例对象
     * @return 影响行数
     */
    int insert(Establishment establishment);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Establishment> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Establishment> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Establishment> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Establishment> entities);

    /**
     * 修改数据
     *
     * @param establishment 实例对象
     * @return 影响行数
     */
    int update(Establishment establishment);

    /**
     * 通过主键删除数据
     *
     * @param xid 主键
     * @return 影响行数
     */
    int deleteById(Integer xid);

}

