package com.companyname.springapp.service;

import java.io.Serializable;
import java.util.List;

import com.companyname.springapp.domain.Product;

public interface ProductManager extends Serializable {

    public void depositMoney(int amount);
    
    public void withdrawMoney(int amount);
    
    public List<Product> getProducts();

}