package com.liu.service.impl;

import com.liu.dao.jdbc.UserDao;
import com.liu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Administrator on 2018/10/19/019.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Map getUserById(int id) {
        return this.userDao.getUserById(id);
    }
}
