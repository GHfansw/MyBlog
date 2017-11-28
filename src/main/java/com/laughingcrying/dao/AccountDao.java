package com.laughingcrying.dao;

import com.laughingcrying.model.Account;

import java.util.List;

public interface AccountDao {
    boolean addAccount(Account a);
    boolean updateAccount(Account a);
    boolean deleteAccount(int accountId);
    List getAccounts();
    Account getAccountByAccountId(String accountId);
}
