package com.laughingcrying.service.Impl;

import com.laughingcrying.dao.ArticalDao;
import com.laughingcrying.model.BaseInfo;
import com.laughingcrying.service.ArticalServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ArticalServImpl implements ArticalServ{
    @Autowired
    private ArticalDao articalDao;

    @Override
    public BaseInfo getAllArtical() {
        return new BaseInfo("0","获取文章",articalDao.findAll());
    }
}
