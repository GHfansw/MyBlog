package com.laughingcrying.dao.Impl;

import com.laughingcrying.dao.AccountDao;
import com.laughingcrying.model.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDaoImpl implements AccountDao{


    @Override
    public int addAccount(Account a) {
        return 0;
    }

    @Override
    public int updateAccount(Account a) {
        return 0;
    }

    @Override
    public int deleteAccount(int accountId) {
        return 0;
    }

    @Override
    public List getAccounts() {
        return null;
    }

    @Override
    public Account getAccountByAccountId(String accountId) {
        return null;
    }
}
