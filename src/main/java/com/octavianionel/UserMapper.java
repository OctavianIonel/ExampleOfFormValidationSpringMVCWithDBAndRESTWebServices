package com.octavianionel;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by octavian on 2/20/17.
 */
public class UserMapper implements RowMapper<User> {

    public User mapRow(ResultSet resultSet, int rowNr) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setUsername(resultSet.getString("username"));
//        user.setPassword(resultSet.getString("password"));
        user.setEmail(resultSet.getString("email"));
        user.setBirthday(resultSet.getDate("birthday"));
        user.setProfession(resultSet.getString("profession"));
        return user;
    }
}
