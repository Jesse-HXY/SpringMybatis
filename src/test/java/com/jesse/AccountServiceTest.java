package com.jesse;

import com.jesse.dao.AccountDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class AccountServiceTest {

    //注入Dao实现类依赖
    @Autowired
    private AccountDao accountDao;


    @Test
    public void testAddMoney() {
        accountDao.deductMoney(2, 200);
    }


}
