package com.laughingcrying.dao;

// JPA查询方式

import com.laughingcrying.model.UserTest;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;



//这个地方不用加注释
//使用mongorepository后面必须有<UserTest, ObjectId>类似的type
//不用实现一般的mongo语句，只要对特殊的语句写@Query即可
public interface UserDaoTest extends MongoRepository<UserTest, ObjectId>{
    @Query(value = "{'username' : ?0}",fields="{ 'username' : 1, 'password' : 1}")
    UserTest findOneByUsername(String username);
}
