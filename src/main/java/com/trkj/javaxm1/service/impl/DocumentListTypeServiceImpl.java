package com.trkj.javaxm1.service.impl;

import com.trkj.javaxm1.mybatis.entity.DocumentListType;
import com.trkj.javaxm1.mybatis.dao.DocumentListTypeDao;
import com.trkj.javaxm1.service.DocumentListTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DocumentListType)表服务实现类
 *
 * @author makejava
 * @since 2021-06-07 13:51:50
 */
@Service("documentListTypeService")
public class DocumentListTypeServiceImpl implements DocumentListTypeService {
    @Resource
    private DocumentListTypeDao documentListTypeDao;

//    /**
//     * 通过ID查询单条数据
//     *
//     * @param 主键
//     * @return 实例对象
//     */
//    @Override
//    public DocumentListType queryById() {
//        return this.documentListTypeDao.queryById();
//    }
//
//    /**
//     * 查询多条数据
//     *
//     * @param offset 查询起始位置
//     * @param limit  查询条数
//     * @return 对象列表
//     */
//    @Override
//    public List<DocumentListType> queryAllByLimit(int offset, int limit) {
//        return this.documentListTypeDao.queryAllByLimit(offset, limit);
//    }
//
//    /**
//     * 新增数据
//     *
//     * @param documentListType 实例对象
//     * @return 实例对象
//     */
//    @Override
//    public DocumentListType insert(DocumentListType documentListType) {
//        this.documentListTypeDao.insert(documentListType);
//        return documentListType;
//    }
//
//
//
//    /**
//     * 通过主键删除数据
//     *
//     * @param 主键
//     * @return 是否成功
//     */
//    @Override
//    public boolean deleteById() {
//        return this.documentListTypeDao.deleteById() > 0;
//    }
}
