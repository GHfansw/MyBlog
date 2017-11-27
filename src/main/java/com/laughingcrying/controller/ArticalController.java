package com.laughingcrying.controller;

import com.alibaba.fastjson.JSON;
import com.laughingcrying.model.BaseInfo;
import com.laughingcrying.service.ArticalServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

@Controller
public class ArticalController {
    protected final Logger logger = Logger.getLogger(ArticalController.class.getName());

    @Autowired
    private ArticalServ articalServ;

    @RequestMapping(value = "/blog/Articals",method = RequestMethod.GET)
    @ResponseBody
    public String showArticals(HttpServletRequest request, Model model){
        System.out.println("!!!!!!!!!!!!!!!!");
        logger.info("come in blog/articals");
        BaseInfo bs = articalServ.getAllArtical();
        return JSON.toJSONString(bs);
    }

//    @RequestMapping("/blog/Articals")
//    public String showArticals2(){
////        System.out.println("!!!!!!!!!!!!!!!!");
////        logger.info("come in blog/articals");
////        BaseInfo bs = articalServ.getAllArtical();
////        return JSON.toJSONString(bs);
//        String s = "sss";
//        return JSON.toJSONString(s);
//    }
}
