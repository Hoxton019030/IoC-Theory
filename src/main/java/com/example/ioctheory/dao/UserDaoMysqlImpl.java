package com.example.ioctheory.dao;

/**
 * @author Hoxton on 2023/3/8
 * @since 1.2.0
 */
public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("印出Mysql");
    }
}
