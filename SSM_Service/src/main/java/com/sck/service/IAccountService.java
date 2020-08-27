package com.sck.service;

import com.sck.pojo.Account;

import java.util.List;

/**
 * 业务层
 */
public interface IAccountService {

    //查询所有账号信息
    public List<Account> findAll();
    //保存账户
    public void saveAccount(Account account);
}
