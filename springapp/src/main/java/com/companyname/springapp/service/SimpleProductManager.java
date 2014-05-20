package com.companyname.springapp.service;

import javax.validation.constraints.Max;

import com.companyname.springapp.domain.Account;

public class SimpleProductManager implements ProductManager {

	private static final long serialVersionUID = 1L;

	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void depositMoney(double amount) {
		if (account != null) {
			double newBalance = account.getBalance() + amount;
			account.setBalance(newBalance);
		}
	}

	public void withdrawMoney(double amount) {
		double newBalance;
		if ((account != null) && (account.getBalance() > amount)) {
			newBalance = account.getBalance() - amount;
			account.setBalance(newBalance);
		} else {
			newBalance = (Double) null;
		}

	}
}