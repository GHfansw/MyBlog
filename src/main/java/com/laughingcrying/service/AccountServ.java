package com.laughingcrying.service;

import com.laughingcrying.model.Account;
import com.laughingcrying.model.BaseInfo;

public interface AccountServ {
    BaseInfo newAccount(Account account);
    BaseInfo updateAccountInfo(Account account);
    BaseInfo findAccountByAccountId(String accountId);
}
