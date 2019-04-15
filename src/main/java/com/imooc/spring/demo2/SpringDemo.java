package com.imooc.spring.demo2;
import com.imooc.spring.demo2.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
/*
声明式的事务管理，方法一：传统方式
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringDemo {

    @Resource(name = "accountServiceProxy")
    private AccountService accountService;

    @Test
    public void demo01(){
        accountService.transter("aaa","bbb",6.2);
    }
}