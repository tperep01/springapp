package com.companyname.springapp.service;

import java.util.List;

import com.companyname.springapp.domain.Product;

public class SimpleProductManager implements ProductManager {

    private static final long serialVersionUID = 1L;
    
    private List<Product> products;

    public List<Product> getProducts() {
    	return products;        
    }
	
    public void setProducts(List<Product> products) {
    	this.products = products;       
    }

	public void depositMoney(int amount) {
		if (products != null) {
            for (Product product : products) {
                double newBalance = product.getBalance() + amount;
                product.setBalance(newBalance);
            }
        }
	}

	public void withdrawMoney(int amount) {
		if (products != null) {
            for (Product product : products) {
                double newBalance = product.getBalance() - amount;
                product.setBalance(newBalance);
            }
        }
	}
}