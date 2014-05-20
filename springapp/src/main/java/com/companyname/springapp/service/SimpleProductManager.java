package com.companyname.springapp.service;

import java.util.List;

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

	public void depositMoney(int amount) {
		if (account != null) {
                double newBalance = account.getBalance() + amount;
                account.setBalance(newBalance);
            }
        }
	

	public double withdrawMoney(int amount) {
		double newBalance = 0;
		if (account != null) {
                newBalance = account.getBalance() - amount;
                account.setBalance(newBalance);
            }
        
		
		return newBalance;
	}
}