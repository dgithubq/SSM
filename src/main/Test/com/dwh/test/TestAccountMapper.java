package com.dwh.test;

import com.dwh.entity.Account;
import com.dwh.mapper.AccountMapper;
import com.dwh.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestAccountMapper {
    @Autowired
    private AccountMapper accountMapper;
    @Test
    public void test(){
        List<Account> accounts = accountMapper.queryAll();
        System.out.println("accounts = " + accounts);
    }
}
