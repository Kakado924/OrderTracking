package com.ordertracking.service;

import com.ordertracking.bean.User;
import com.ordertracking.dao.UserDao;

import java.util.logging.Logger;

/**
 * Created by chlei on 2016/3/10.
 */
public class LoginService {
    private static final Logger LOGGER = Logger.getLogger(LoginService.class.getName());
    /**
     *  login 的业务逻辑
     * @param username
     * @param password
     * @return
     */
    public int login(String username ,String password) {
        UserDao userDao = new UserDao();
        User user = userDao.getUserByUserName(username);
        if (user == null) {
            return -1;
        }else if (password.equals(user.getPassword())) {
            return user.getAuthority();
        }
        return -1;
    }
}
