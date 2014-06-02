package com.companyname.springapp.service;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Withdraw {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    @Min(0)
    
    private double amount;

    public void setAmount(double i) {
        amount = i;
        logger.info("Amount set to " + i);
    }

    public double getAmount() {
        return amount;
    }

}