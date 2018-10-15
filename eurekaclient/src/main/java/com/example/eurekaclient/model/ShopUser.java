package com.example.eurekaclient.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-10-09
 */
public class ShopUser {
    private Integer id;

    private String shopAccount;

    private String shopPassword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopAccount() {
        return shopAccount;
    }

    public void setShopAccount(String shopAccount) {
        this.shopAccount = shopAccount == null ? null : shopAccount.trim();
    }

    public String getShopPassword() {
        return shopPassword;
    }

    public void setShopPassword(String shopPassword) {
        this.shopPassword = shopPassword == null ? null : shopPassword.trim();
    }
}