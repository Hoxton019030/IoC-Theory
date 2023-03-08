package com.example.ioctheory.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Hoxton on 2023/3/8
 * @since 1.2.0
 */
class UserServiceImplTest {

    @Test
    void test(){
        //調用Service層
        UserServiceImpl userService = new UserServiceImpl();
        userService.getUser();
    }

}