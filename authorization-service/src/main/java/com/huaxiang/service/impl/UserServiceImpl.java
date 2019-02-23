package com.huaxiang.service.impl;

import com.huaxiang.dao.UserDao;
import com.huaxiang.domain.SysUser;
import com.huaxiang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public SysUser getUserByName(String username) {
        return userDao.selectByName(username);
    }
}
