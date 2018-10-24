package com.liu.service.impl;

import com.github.pagehelper.PageHelper;
import com.liu.dao.jdbc.UserDao;
import com.liu.mapper.UserMapper;
import com.liu.model.User;
import com.liu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/10/19/019.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserMapper userMapper;

    @Override
    public Map getUserById(int id) {
        return this.userDao.getUserById(id);
    }

    @Override
    public List<User> selectAllUser(int pageNo, int pageNum) {
        PageHelper.startPage(pageNo, pageNum);
        return this.userMapper.selectAllUser();
    }
}
