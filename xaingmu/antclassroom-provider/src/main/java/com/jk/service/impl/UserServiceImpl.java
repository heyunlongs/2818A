package com.jk.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.dao.UserDao;
import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2018/5/14 0014.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;


}
