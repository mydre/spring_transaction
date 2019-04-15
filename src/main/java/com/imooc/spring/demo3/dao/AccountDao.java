package com.imooc.spring.demo3.dao;
public interface AccountDao {
    void outMoney(String out, Double money);
    void inMoney(String in, Double money);
}
