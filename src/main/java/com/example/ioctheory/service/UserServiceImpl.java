package com.example.ioctheory.service;

import com.example.ioctheory.dao.UserDao;
import com.example.ioctheory.dao.UserDaoImpl;
import com.example.ioctheory.dao.UserDaoMysqlImpl;

/**
 * @author Hoxton on 2023/3/8
 * @since 1.2.0
 */
public class UserServiceImpl implements UserService {
    //需求變更，要一直改這邊
    private UserDao userDao = new UserDaoMysqlImpl();

    public void getUser() {
        userDao.getUser();
    }
}
