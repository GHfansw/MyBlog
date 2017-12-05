package com.laughingcrying.controller;

import com.alibaba.fastjson.JSON;
import com.laughingcrying.model.Account;
import com.laughingcrying.model.BaseInfo;
import com.laughingcrying.service.AccountServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

@Controller
public class AccountController {
    protected final Logger logger = Logger.getLogger(AccountController.class.getName());

    @Autowired
    private AccountServ accountServ;


    @RequestMapping(value = "/account/new",method = RequestMethod.POST)
    @ResponseBody
    public String toAddAccount(Account account){
        System.out.println("!!!!!!!!!!!!!!!!");
        logger.info("come in account/new");
        BaseInfo bs = accountServ.newAccount(account);
        return JSON.toJSONString(bs);
    }

    @RequestMapping(value = "/account/login",method = RequestMethod.GET)
    @ResponseBody
    public String accountLogin(Account account,HttpServletRequest request){
        System.out.println("!!!!!!!!!!!!!!!!");
        logger.info("come in account/login");
        BaseInfo bs = accountServ.findAccountByAccountId(account.getAccountId());
        if (bs.getError().equals("0")){
            Account db_account = (Account) bs.getObject();
            if (db_account.getPassword().equals(account.getPassword())){
                System.out.println(account.getAccountId());
                request.getSession().setAttribute("account_info",db_account);
                return JSON.toJSONString(bs.getObject());
            }
        }
        return JSON.toJSONString(new Integer(1));
    }
}
