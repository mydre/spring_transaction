package com.imooc.spr_trans.service;
import com.imooc.spr_trans.dao.AccountDao;
import com.imooc.spr_trans.dao.AccountDaoImpl;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
public class AccountServiceImpl implements AccountService{
    //因为在xml中，AccountDao作为一个属性，被注入进了AccountService，所以这个直接使用setter函数给私有成员变量设置值
    private AccountDao accountDao;
    private TransactionTemplate transactionTemplate;
    public void setAccountDao(AccountDaoImpl accountDao) {
        this.accountDao = accountDao;
    }
    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void transter(String out, String in, Double money) {
        transactionTemplate.execute(new MyT(out,in,money));
    }

    private class MyT extends TransactionCallbackWithoutResult{
        private String out;
        private String in;
        private Double money;
        MyT(String out,String in,Double money){
            this.out = out;
            this.in = in;
            this.money = money;
        }
        protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
            accountDao.inMoney(in,money);
            int i = 1 / 0;
            accountDao.outMoney(out,money);
        }
    }
}
