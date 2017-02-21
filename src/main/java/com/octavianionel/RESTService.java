package com.octavianionel;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by octavian on 2/21/17.
 */
@Produces("application/json")
public class RESTService {

    @Resource
    private UserJDBCTemplate userJDBCTemplate;
    /**
     * testmap
     * @return map containing name value pair
     */
    @GET
    @Path("/test")
    public Map<String, String> getTestMap() {
        Map<String, String> returnMap = new HashMap<String, String>();
        returnMap.put("name", "value");
        return returnMap;
    }

    @GET
    @Path("/getAllUsersInJSON")
    public Map<String, List<User>> getAllUsersInJSON() {
        Map<String, List<User>> returnMap = new HashMap<String, List<User>>();
        List<User> users = userJDBCTemplate.listOfUsers();
        returnMap.put("name", users);
        return returnMap;
    }
}
