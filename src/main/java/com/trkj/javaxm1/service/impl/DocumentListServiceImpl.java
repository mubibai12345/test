package com.trkj.javaxm1.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.javaxm1.mybatis.entity.DocumentList;
import com.trkj.javaxm1.mybatis.dao.DocumentListDao;
import com.trkj.javaxm1.mybatis.entity.Shop;
import com.trkj.javaxm1.service.DocumentListService;
import com.trkj.javaxm1.util.BeanTools;
import com.trkj.javaxm1.vo.DocumentlistVo;
import com.trkj.javaxm1.vo.ShopVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (DocumentList)表服务实现类
 *
 * @author makejava
 * @since 2021-06-07 11:09:32
 */
@Service("documentListService")
public class DocumentListServiceImpl implements DocumentListService {
    @Resource
    private DocumentListDao documentListDao;

    /**
     * kk:条件查询销售审核单
     * @param branchid
     * @param customerid
     * @param userid
     * @param gjz
     * @param currentPage
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<DocumentlistVo> findallbyfdandkhanduserandgjz(int branchid, int customerid, int userid, String gjz, int currentPage, int pageSize) {
        List<DocumentlistVo> list = documentListDao.findallbyfdandkhanduserandgjz(branchid,userid,customerid,gjz);
        Page<Shop> page= PageHelper.startPage(currentPage,pageSize,true);
        List<DocumentlistVo> list2 = documentListDao.findallbyfdandkhanduserandgjz(branchid,userid,customerid,gjz);
        PageInfo<DocumentlistVo> info=new PageInfo<>(list2);
        info.setTotal((long)list.size() );
        return info;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DocumentList queryById(Integer id) {
        return this.documentListDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<DocumentList> queryAllByLimit(int offset, int limit) {
        return this.documentListDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param documentList 实例对象
     * @return 实例对象
     */
    @Override
    public DocumentList insert(DocumentList documentList) {
        this.documentListDao.insert(documentList);
        return documentList;
    }

    /**
     * 修改数据
     *
     * @param documentList 实例对象
     * @return 实例对象
     */
    @Override
    public DocumentList update(DocumentList documentList) {
        this.documentListDao.update(documentList);
        return this.queryById(documentList.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.documentListDao.deleteById(id) > 0;
    }
}
