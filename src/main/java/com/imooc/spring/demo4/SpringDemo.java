package com.imooc.spring.demo4;

import com.imooc.spring.demo4.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;

/*
声明式的事务管理，方法一：传统方式
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringDemo {

    //基于BeanPostProfessor，在注入类的过程中就已经对类进行了增强，本身就是一个代理对象，所以可以直接注入。
    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void demo01(){
        accountService.transfer("aaa","bbb",200d);
    }
}