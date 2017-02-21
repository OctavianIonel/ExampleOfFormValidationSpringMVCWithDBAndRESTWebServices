package com.octavianionel;

import javax.sql.DataSource;
import java.util.Date;
import java.util.List;

/**
 * Created by octavian on 2/20/17.
 */
public interface UserDAO {



    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource dataSource);



    /**
     * This is the method to be used to create
     * a record in the User table.
     */
    public void create(String username, String password, String email, Date birthday, String profession);



    /**
     * This is the method to be used to list down
     * a record from the User table corresponding
     * to a passed user id.
     */
    public User getUser(Integer id);



    /**
     * This is the method to be used to list down
     * all the records from the User table.
     */
    public List<User> listOfUsers();



    /**
     * This is the method to be used to delete
     * a record from the User table corresponding
     * to a passed user id.
     */
    public void delete(Integer id);



    /**
     * This is the method to be used to update
     * a record into the User table.
     */
    public void update(Integer id, String username);

}
