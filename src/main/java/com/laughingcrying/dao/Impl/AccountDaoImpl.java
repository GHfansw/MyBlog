package com.laughingcrying.dao.Impl;

import com.laughingcrying.dao.AccountDao;
import com.laughingcrying.model.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDaoImpl implements AccountDao{


    @Override
    public boolean addAccount(Account a) {
        return false;
    }

    @Override
    public boolean updateAccount(Account a) {
        return false;
    }

    @Override
    public boolean deleteAccount(int accountId) {
        return false;
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
