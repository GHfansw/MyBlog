package com.laughingcrying.service.Impl;

import com.laughingcrying.dao.AccountDao;
import com.laughingcrying.model.Account;
import com.laughingcrying.model.BaseInfo;
import com.laughingcrying.service.AccountServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServImpl implements AccountServ{
    @Autowired
    private AccountDao accountDao;

    @Override
    public BaseInfo newAccount(Account account) {
        return new BaseInfo("0","add Account",accountDao.addAccount(account));
    }

    @Override
    public BaseInfo updateAccountInfo(Account account) {
        return new BaseInfo("0","update account",accountDao.updateAccount(account));
    }

    @Override
    public BaseInfo findAccountByAccountId(String accountId) {
        return new BaseInfo("0","find account for login",accountDao.getAccountByAccountId(accountId));
    }
}
