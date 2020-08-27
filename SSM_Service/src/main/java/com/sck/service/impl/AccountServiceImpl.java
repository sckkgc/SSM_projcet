package com.sck.service.impl;

import com.sck.dao.IAccountDao;
import com.sck.pojo.Account;
import com.sck.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//这里的value可以省略不写，但是你想写就按照类名称小写，其他的照旧即可@Service("accountServiceImpl")
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }
}
