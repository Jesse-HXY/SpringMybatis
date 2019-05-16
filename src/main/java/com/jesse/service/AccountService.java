package com.jesse.service;

import com.jesse.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    @Transactional
    public void transferMoney(){
        accountDao.deductMoney(1,100);
        accountDao.addMoney(2, 100);
    }

    @Transactional
    public void addMoney()
    {
        accountDao.addMoney(1, 100);
        accountDao.addMoney(2, 100);
    }
}
