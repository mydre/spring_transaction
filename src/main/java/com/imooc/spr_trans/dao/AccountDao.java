package com.imooc.spr_trans.dao;
public interface AccountDao {
    void outMoney(String out, Double money);
    void inMoney(String in,Double money);
}
