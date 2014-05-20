package com.companyname.springapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.companyname.springapp.service.Deposit;
import com.companyname.springapp.service.ProductManager;

@Controller
@RequestMapping(value="/deposit.htm")
public class DepositFormController {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private ProductManager productManager;

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid Deposit deposit, BindingResult result)
    {
        if (result.hasErrors()) {
            return "deposit";
        }
		
        double amount = deposit.getAmount();
        logger.info("Deposit " + amount);

        productManager.depositMoney(amount);

        return "redirect:/accountdata.htm";
    }

    @RequestMapping(method = RequestMethod.GET)
    protected Deposit formBackingObject(HttpServletRequest request) throws ServletException {
        Deposit priceIncrease = new Deposit();
        //priceIncrease.setPercentage(15);
        return priceIncrease;
    }

    public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    }

    public ProductManager getProductManager() {
        return productManager;
    }

}