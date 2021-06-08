package com.trkj.javaxm1.service.impl;

import com.trkj.javaxm1.mybatis.entity.DocumentShop;
import com.trkj.javaxm1.mybatis.dao.DocumentShopDao;
import com.trkj.javaxm1.service.DocumentShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DocumentShop)表服务实现类
 *
 * @author makejava
 * @since 2021-06-07 13:52:24
 */
@Service("documentShopService")
public class DocumentShopServiceImpl implements DocumentShopService {
    @Resource
    private DocumentShopDao documentShopDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DocumentShop queryById(Integer id) {
        return this.documentShopDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<DocumentShop> queryAllByLimit(int offset, int limit) {
        return this.documentShopDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param documentShop 实例对象
     * @return 实例对象
     */
    @Override
    public DocumentShop insert(DocumentShop documentShop) {
        this.documentShopDao.insert(documentShop);
        return documentShop;
    }

    @Override
    public int insertBatch(List<DocumentShop> documentShops) {

        return documentShopDao.insertBatch(documentShops);
    }

    /**
     * 修改数据
     *
     * @param documentShop 实例对象
     * @return 实例对象
     */
    @Override
    public DocumentShop update(DocumentShop documentShop) {
        this.documentShopDao.update(documentShop);
        return this.queryById(documentShop.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.documentShopDao.deleteById(id) > 0;
    }
}
