package com.liu.dao.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by Administrator on 2018/10/18/018.
 */
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplete;

    public Map getUserById(int id) {
        String sql = "select * from user where id=?";
        Map<String, Object> stringObjectMap = this.jdbcTemplete.queryForMap(sql, new Object[]{id});
        return stringObjectMap;
    }
}
