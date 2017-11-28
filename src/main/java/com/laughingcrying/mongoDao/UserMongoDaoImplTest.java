package com.laughingcrying.mongoDao;


import com.laughingcrying.model.UserTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;


import javax.annotation.Resource;
import java.util.List;


@Repository
public class UserMongoDaoImplTest implements UserMongoDaoTest {

    //MongoTemplate是数据库和代码之间的接口，对数据库的操作都在它里面
    @Resource
    private MongoTemplate mongoTemplate;

    @Override public List<UserTest> findAll() {
        return mongoTemplate.findAll(UserTest.class,"user");
    }

    @Override public void insertUser(UserTest User) {
        mongoTemplate.insert(User,"user");
    }

    @Override public void removeUser(String userName) {
        mongoTemplate.remove(Query.query(Criteria.where("username").is(userName)),"user");
    }

    @Override public void updateUser() {
        mongoTemplate.updateMulti(Query.query(Criteria.where("age").gt(3).lte(5)), Update.update("age",3),"user");
    }

    @Override public List<UserTest> findForRequery(String userName) {
        return mongoTemplate.find(Query.query(Criteria.where("username").is(userName)),UserTest.class);
    }

}
