package com.trkj.javaxm1.service;

import com.trkj.javaxm1.mybatis.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> findAll();
}
