package com.octavianionel;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Date;
import java.util.List;

/**
 * Created by octavian on 2/20/17.
 */
public class UserJDBCTemplate implements UserDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void create(String username, String password, String email, Date birthday) {
        String sql = "insert into User(username, password, email, birthday) values (?, ?, ?, ?)";
        jdbcTemplate.update(sql, username, password, email, birthday);
        System.out.println("Created Record Username = " + username + " Password = " + password + " Email = " + email + " Birthday = " + birthday);
    }

    public User getUser(Integer id) {
        String sql = "select * from User where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new Object[]{id}, new UserMapper());
        return user;
    }

    public List<User> listOfUsers() {
        String sql = "select * from User";
        List<User> users = jdbcTemplate.query(sql, new UserMapper());
        return users;
    }

    public void delete(Integer id) {
        String sql = "delete from User where id = ?";
        jdbcTemplate.update(sql, id);
        System.out.println("Deleted Record with ID = " + id );
    }

    public void update(Integer id, String username) {
        String sql = "update User set username = ? where id = ?";
        jdbcTemplate.update(sql, username, id);
        System.out.println("Updated Record with ID = " + id );
    }
}
