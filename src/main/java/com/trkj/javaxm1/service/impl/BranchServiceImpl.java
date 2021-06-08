package com.trkj.javaxm1.service.impl;

import com.trkj.javaxm1.mybatis.dao.BranchDao;
import com.trkj.javaxm1.mybatis.entity.Branch;
import com.trkj.javaxm1.service.BranchService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("branchService")
public class BranchServiceImpl implements BranchService {
    @Resource
    private BranchDao branchDao;

    @Override
    public List<Branch> findall() {
        return branchDao.findAll();
    }
}
