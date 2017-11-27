package com.laughingcrying.mongoDao;


import com.laughingcrying.model.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;


import javax.annotation.Resource;
import java.util.List;


@Repository
public class UserMongoDaoImpl implements UserMongoDao {

    //MongoTemplate是数据库和代码之间的接口，对数据库的操作都在它里面
    @Resource
    private MongoTemplate mongoTemplate;

    @Override public List<User> findAll() {
        return mongoTemplate.findAll(User.class,"user");
    }

    @Override public void insertUser(User User) {
        mongoTemplate.insert(User,"user");
    }

    @Override public void removeUser(String userName) {
        mongoTemplate.remove(Query.query(Criteria.where("username").is(userName)),"user");
    }

    @Override public void updateUser() {
        mongoTemplate.updateMulti(Query.query(Criteria.where("age").gt(3).lte(5)), Update.update("age",3),"user");
    }

    @Override public List<User> findForRequery(String userName) {
        return mongoTemplate.find(Query.query(Criteria.where("username").is(userName)),User.class);
    }

}
