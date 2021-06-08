package com.trkj.javaxm1.mybatis.dao;

import com.trkj.javaxm1.mybatis.entity.Branch;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Branch)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-01 16:24:54
 */
@Mapper
public interface BranchDao {

    List<Branch> findAll();
    /**
     * 通过ID查询单条数据
     *
     * @param branchid 主键
     * @return 实例对象
     */
    Branch queryById(Integer branchid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Branch> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param branch 实例对象
     * @return 对象列表
     */
    List<Branch> queryAll(Branch branch);

    /**
     * 新增数据
     *
     * @param branch 实例对象
     * @return 影响行数
     */
    int insert(Branch branch);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Branch> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Branch> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Branch> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Branch> entities);

    /**
     * 修改数据
     *
     * @param branch 实例对象
     * @return 影响行数
     */
    int update(Branch branch);

    /**
     * 通过主键删除数据
     *
     * @param branchid 主键
     * @return 影响行数
     */
    int deleteById(Integer branchid);

}

