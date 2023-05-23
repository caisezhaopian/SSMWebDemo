package org.caisezhaopian.SSMWebDemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.caisezhaopian.SSMWebDemo.entity.Account;
import org.caisezhaopian.SSMWebDemo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping(value = "/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    /**
     * list集合查询
     */
    @RequestMapping(value = "/list")
    public String list(Account account, HttpServletRequest request, HttpSession session){
        List<Account> accountList = accountService.list();
        request.setAttribute("list", accountList);
        return "/jsp/list"; }
}
