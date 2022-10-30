package org.caisezhaopian.SSMWebDemo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.caisezhaopian.SSMWebDemo.entity.Account;

import java.util.List;

public interface AccountDao {
    /***
     * 保存账号
     */
    @Insert("insert into account(id,name,money) values(#{id},#{name},#{money})")
    int add(@Param("account") Account account);


    /***
     * 查询所有
     */
    @Select("select * from account")
    List<Account> list();
}