package com.laughingcrying.dao;

import com.laughingcrying.model.Account;

import java.util.List;

public interface AccountDao {
    int addAccount(Account a);
    int updateAccount(Account a);
    int deleteAccount(int accountId);
    List getAccounts();
    Account getAccountByAccountId(String accountId);
}
