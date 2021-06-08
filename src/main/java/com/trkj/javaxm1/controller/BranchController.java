package com.trkj.javaxm1.controller;

import com.trkj.javaxm1.mybatis.entity.Branch;
import com.trkj.javaxm1.service.BranchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("branch")
public class BranchController {
    @Resource
    private BranchService branchService;

    @GetMapping("findbranch")
    public List<Branch> findall(){
        return branchService.findall();
    }
}
