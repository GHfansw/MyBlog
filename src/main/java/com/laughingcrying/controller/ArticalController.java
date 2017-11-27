package com.laughingcrying.controller;

import com.alibaba.fastjson.JSON;
import com.laughingcrying.model.BaseInfo;
import com.laughingcrying.service.ArticalServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
public class ArticalController {
    protected final Logger logger = Logger.getLogger(ArticalController.class.getName());

    @Autowired
    private ArticalServ articalServ;

    @GetMapping("/blog/Articals")
    @ResponseBody
    public String showArticals(){
        logger.info("come in blog/articals");
        BaseInfo bs = articalServ.getAllArtical();
        return JSON.toJSONString(bs);
    }

}
