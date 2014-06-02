package com.companyname.springapp.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTests {

    private Account account;

    @Before
    public void setUp() throws Exception {
        account = new Account();
    }

    @Test
    public void testSetAndGetId() {
        String testId = "1245956";
        assertNull(account.getId());
        account.setId(testId);
        assertEquals(testId, account.getId());
    }
    
    @Test
    public void testSetAndGetName() {
        String testName = "Luisa Llorente";
        assertNull(account.getName());
        account.setName(testName);
        assertEquals(testName, account.getName());
    }
    
    @Test
    public void testSetAndGetDni() {
        String testDni = "12587458L";
        assertNull(account.getDni());
        account.setDni(testDni);
        assertEquals(testDni, account.getDni());
    }

    @Test
    public void testSetAndGetBalance() {
        double testBalance = 100.00;
        assertEquals(0, 0, 0);    
        account.setBalance(testBalance);
        assertEquals(testBalance, account.getBalance(), 0);
    }

}