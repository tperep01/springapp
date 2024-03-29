package com.companyname.springapp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accounts")

public class Account implements Serializable {

	@Id
    @Column(name = "id")
	
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String dni;
    private Double balance;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getDni() {
    	return dni;
    }
    
    public void setDni(String dni) {
    	this.dni = dni;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Account ID: " + id + ";");
        buffer.append("Name: " + name + ";");
        buffer.append("DNI: " + dni + ";");
        buffer.append("Balance: " + balance);
        return buffer.toString();
    }
}