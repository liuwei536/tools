package com.liu.service;

import com.liu.model.User;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/10/18/018.
 */
public interface UserService {

    Map getUserById(int id);

    List<User> selectAllUser(int pageNo,int pageNum);


}
