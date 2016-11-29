package com.szkingdom.ssm.controller;

import com.szkingdom.ssm.entity.Account;
import com.szkingdom.ssm.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by tian on 2016/7/30.
 */

@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/helloMethod")
    public ModelAndView helloMethod(ModelAndView modelAndView) {


        Account account=new Account();
        account.setAccLogin("admin");
        Account account1=accountService.loginService(account);
        modelAndView.addObject("Account",account1);
        modelAndView.setViewName("hello");

        return modelAndView;

    }


}
