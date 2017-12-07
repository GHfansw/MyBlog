package com.laughingcrying.mongoDao.Impl;

import com.laughingcrying.model.Comment;
import com.laughingcrying.mongoDao.ArticalDao;
import com.laughingcrying.model.Artical;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class ArticalDaoImpl implements ArticalDao {
    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public List<Artical> findAll() {
        return this.mongoTemplate.findAll(Artical.class,"artical");
    }

    //需要解决title相同时的情况
    @Override
    public boolean addArtical(Artical artical) {
        this.mongoTemplate.insert(artical,"artical");
        return true;
    }

    @Override
    public boolean addLikeBytitle(String title) {
        //这里考虑是不是改成update的inc方法
        Artical likes = mongoTemplate.findOne(new Query(Criteria.where("title").is(title)),Artical.class,"artical");
        this.mongoTemplate.updateFirst(new Query(Criteria.where("title").is(title)), Update.update("likes",String.valueOf(likes.getLikes()+1)),"artical");
        return true;
    }

    @Override
    public boolean loseLikeBytitle(String title) {
        Artical likes = mongoTemplate.findOne(new Query(Criteria.where("title").is(title)),Artical.class,"artical");
        this.mongoTemplate.updateFirst(new Query(Criteria.where("title").is(title)), Update.update("likes",String.valueOf(likes.getLikes()-1)),"artical");
        return true;
    }

    @Override
    public boolean addCommentBytitle(String title,Comment comment) {
        Update update = new Update();
        update.addToSet("comments",comment);
        this.mongoTemplate.updateFirst(new Query(Criteria.where("title").is(title)),update,"artical");
        return true;
    }

    @Override
    public boolean addLikeToComment() {
        return false;
    }

}
