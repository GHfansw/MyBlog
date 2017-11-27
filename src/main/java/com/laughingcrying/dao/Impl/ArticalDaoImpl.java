package com.laughingcrying.dao.Impl;

import com.laughingcrying.dao.ArticalDao;
import com.laughingcrying.model.Artical;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class ArticalDaoImpl implements ArticalDao {
    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public List<Artical> findAll() {
        return this.mongoTemplate.findAll(Artical.class, "artical");
    }

    @Override
    public void addArtical(Artical artical) {
        this.mongoTemplate.insert(artical,"artical");
    }
}
