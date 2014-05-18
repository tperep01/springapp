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
import com.companyname.springapp.service.Withdraw;

@Controller
@RequestMapping(value="/withdraw.htm")
public class WithdrawFormController {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private ProductManager productManager;

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid Withdraw withdraw, BindingResult result)
    {
        if (result.hasErrors()) {
            return "withdraw";
        }
		
        int amount = withdraw.getAmount();
        logger.info("Withdraw " + amount);

        productManager.withdrawMoney(amount);

        return "redirect:/accountdata.htm";
    }

    @RequestMapping(method = RequestMethod.GET)
    protected Withdraw formBackingObject(HttpServletRequest request) throws ServletException {
        Withdraw withdraw = new Withdraw();
        //priceIncrease.setPercentage(15);
        return withdraw;
    }

    public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    }

    public ProductManager getProductManager() {
        return productManager;
    }
}
