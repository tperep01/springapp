package com.companyname.springapp.service;

import java.io.Serializable;
import java.util.List;

import com.companyname.springapp.domain.Account;

public interface ProductManager extends Serializable {

    public void depositMoney(int amount);
    
    public double withdrawMoney(int amount);
    
    public Account getAccount();

}