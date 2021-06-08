package com.trkj.javaxm1.service.impl;

import com.trkj.javaxm1.mybatis.dao.AddressDao;
import com.trkj.javaxm1.mybatis.entity.Address;
import com.trkj.javaxm1.service.AddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("addressService")
public class AddressServiceImpl implements AddressService {

    @Resource
    private AddressDao addressDao;
    @Override
    public List<Address> findAll() {
        return addressDao.findAll();
    }
}
