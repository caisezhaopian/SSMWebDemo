package org.caisezhaopian.SSMWebDemo.service;

import org.caisezhaopian.SSMWebDemo.entity.Account;

import java.util.List;

public interface AccountService {
    /***
     * 集合
     */
    List<Account> list();
    /***
     * 增加
     */
    int add(Account account);
}
