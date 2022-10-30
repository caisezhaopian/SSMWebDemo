package org.caisezhaopian.SSMWebDemo.service.impl;

import org.caisezhaopian.SSMWebDemo.dao.AccountDao;
import org.caisezhaopian.SSMWebDemo.entity.Account;
import org.caisezhaopian.SSMWebDemo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> list() {
        List<Account> acc = accountDao.list();
        System.out.println("AccountServiceImpl.list");
        return acc;
    }

    @Override
    public int add(Account account) {
        Integer acc = accountDao.add(account);
        System.out.println("AccountServiceImpl.add");
        return acc;
    }
}
