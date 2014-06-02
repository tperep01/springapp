package com.companyname.springapp.service;

import javax.validation.constraints.Max;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.companyname.springapp.repository.AccountDao;

import com.companyname.springapp.domain.Account;

@Component
public class SimpleProductManager implements ProductManager {

	private static final long serialVersionUID = 1L;
	
	@Autowired
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

	private Account account;

	public List<Account> getListAccount() {
        return accountDao.getAccountList();
    }
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void depositMoney(double amount) {
		List<Account> accounts = accountDao.getAccountList();
		account = accounts.get(0);
		if (account != null) {
			double newBalance = account.getBalance() + amount;
			account.setBalance(newBalance);
			accountDao.saveAccount(account);
		}
	}

	public void withdrawMoney(double amount) {
		List<Account> accounts = accountDao.getAccountList();
		account = accounts.get(0);
		double newBalance;
		if ((account != null) && (account.getBalance() > amount)) {
			newBalance = account.getBalance() - amount;
			account.setBalance(newBalance);
			accountDao.saveAccount(account);
		} else {
			newBalance = (Double) null;
		}

	}
}