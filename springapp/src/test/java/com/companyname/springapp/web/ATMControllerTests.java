package com.companyname.springapp.web;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;


public class ATMControllerTests {

    @Test
    public void testHandleRequestView() throws Exception{		
        ATMController controller = new ATMController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("accountdata", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull(nowValue);

    }

}