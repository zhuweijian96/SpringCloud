package com.example.eurekaclient.serviceimpl;

import com.example.eurekaclient.mapper.ShopUserMapper;
import com.example.eurekaclient.model.ShopUser;
import com.example.eurekaclient.service.ShopUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopUserServiceImpl implements ShopUserService {

    @Autowired
    ShopUserMapper shopUserMapper;

    @Override
    public ShopUser getById(Integer id) {
        return shopUserMapper.selectByPrimaryKey(id);
    }
}
