package com.trkj.javaxm1.controller;

import com.trkj.javaxm1.mybatis.entity.Address;
import com.trkj.javaxm1.service.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("address")
public class AddressController {
    @Resource
    private AddressService addressService;

    @GetMapping("findaddress")
    public List<Address> findall(){
        return addressService.findAll();
    }
}
