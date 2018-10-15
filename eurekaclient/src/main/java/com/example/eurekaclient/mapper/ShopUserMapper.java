package com.example.eurekaclient.mapper;


import com.example.eurekaclient.model.ShopUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShopUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopUser record);

    int insertSelective(ShopUser record);

    ShopUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopUser record);

    int updateByPrimaryKey(ShopUser record);
}