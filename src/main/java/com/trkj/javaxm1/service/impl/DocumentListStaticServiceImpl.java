package com.trkj.javaxm1.service.impl;

import com.trkj.javaxm1.mybatis.entity.DocumentListStatic;
import com.trkj.javaxm1.mybatis.dao.DocumentListStaticDao;
import com.trkj.javaxm1.service.DocumentListStaticService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DocumentListStatic)表服务实现类
 *
 * @author makejava
 * @since 2021-06-07 11:38:11
 */
@Service("documentListStaticService")
public class DocumentListStaticServiceImpl implements DocumentListStaticService {
    @Resource
    private DocumentListStaticDao documentListStaticDao;

//    /**
//     * 通过ID查询单条数据
//     *
//     * @param 主键
//     * @return 实例对象
//     */
//    @Override
//    public DocumentListStatic queryById() {
//        return this.documentListStaticDao.queryById();
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
//    public List<DocumentListStatic> queryAllByLimit(int offset, int limit) {
//        return this.documentListStaticDao.queryAllByLimit(offset, limit);
//    }
//
//    /**
//     * 新增数据
//     *
//     * @param documentListStatic 实例对象
//     * @return 实例对象
//     */
//    @Override
//    public DocumentListStatic insert(DocumentListStatic documentListStatic) {
//        this.documentListStaticDao.insert(documentListStatic);
//        return documentListStatic;
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
//        return this.documentListStaticDao.deleteById() > 0;
//    }
}
