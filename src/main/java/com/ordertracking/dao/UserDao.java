package com.ordertracking.dao;

import com.ordertracking.bean.User;
import com.ordertracking.utils.SQLServerManager;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by chlei on 2016/3/10.
 */
public class UserDao {

    public User getUserByUserName(String username) {
        SqlSession session = SQLServerManager.getSqlSession();
        String statement = "com.ordertracking.mapping.userMapper.getUserByUserName";
        User user = session.selectOne(statement, username);
        return user;
    }
}
