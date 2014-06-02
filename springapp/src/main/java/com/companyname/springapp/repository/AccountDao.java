package com.companyname.springapp.repository;

import java.util.List;

import com.companyname.springapp.domain.Account;

public interface AccountDao {

    public List<Account> getAccountList();

    public void saveAccount(Account acc);

}