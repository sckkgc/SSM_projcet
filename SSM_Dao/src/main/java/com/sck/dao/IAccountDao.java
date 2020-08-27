package com.sck.dao;

import com.sck.pojo.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久层
 */
@Repository
public interface IAccountDao {
    //查询所有，由于我们开启了注解支持，这里就使用注解方式了。
    @Select("select * from account")
    public List<Account> findAll();

    //保存帐号
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void saveAccount(Account account);
}
