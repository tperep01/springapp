package com.companyname.springapp.service;

import java.io.Serializable;
import java.util.List;

import com.companyname.springapp.domain.Account;

public interface ProductManager extends Serializable {

	public void depositMoney(double amount);

	public void withdrawMoney(double amount);

	public List<Account> getListAccount();
	
	public Account getAccount();

}