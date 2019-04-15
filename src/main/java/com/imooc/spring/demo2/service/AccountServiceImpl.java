package com.imooc.spring.demo2.service;
import com.imooc.spring.demo2.dao.AccountDao;
import com.imooc.spring.demo2.dao.AccountDaoImpl;


public class AccountServiceImpl implements AccountService {
    //因为在xml中，AccountDao作为一个属性，被注入进了AccountService，所以这个直接使用setter函数给私有成员变量设置值

    private AccountDao accountDao;
    public void setAccountDao(AccountDaoImpl accountDao) {
        this.accountDao = accountDao;
    }

    public void transter(String out, String in, Double money) {
        accountDao.outMoney(out,money);
        //int i = 1 / 0;
        accountDao.inMoney(in,money);
    }
}