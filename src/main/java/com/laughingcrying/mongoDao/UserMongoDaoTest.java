package com.laughingcrying.mongoDao;

import com.laughingcrying.model.UserTest;

import java.util.List;


// 使用mongoTemplate的查询
public interface UserMongoDaoTest {
    List<UserTest> findAll();
    void insertUser(UserTest user);
    void removeUser(String userName);
    void updateUser();
    List<UserTest> findForRequery(String userName);

}
