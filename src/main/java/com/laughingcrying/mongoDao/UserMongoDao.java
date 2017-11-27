package com.laughingcrying.mongoDao;

import com.laughingcrying.model.User;

import java.util.List;


// 使用mongoTemplate的查询
public interface UserMongoDao{
    List<User> findAll();
    void insertUser(User user);
    void removeUser(String userName);
    void updateUser();
    List<User> findForRequery(String userName);

}
