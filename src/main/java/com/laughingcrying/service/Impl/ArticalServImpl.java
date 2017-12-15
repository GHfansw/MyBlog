package com.laughingcrying.service.Impl;

import com.laughingcrying.model.Artical;
import com.laughingcrying.mongoDao.ArticalDao;
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

    @Override
    public BaseInfo setArtical(Artical artical) {
        if(articalDao.addArtical(artical))
            return new BaseInfo("0","添加文章",null);
        else
            return new BaseInfo("1","添加文章失败",null);
    }

    @Override
    public BaseInfo setLikeByTitle(String title) {
        return new BaseInfo("0","增加喜欢",articalDao.addLikeBytitle(title));
    }
}
