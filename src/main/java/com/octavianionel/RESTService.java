package com.octavianionel;

import com.sun.deploy.util.SystemUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
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

    //-------------------Create a User--------------------------------------------------------
    /**
     * http://localhost:8080/rest/createUser
     {
     "username":"Andrew Shefield",
     "password":"1234",
     "email":"andrew.shefield@xxx.com",
     "birthday":"1985-10-04",
     "profession":"Developer"
     }
    **/


//    @POST
//    @Consumes("application/json")
//    @Path("/createUser")
//    public Response createUser(@RequestBody User user, UriComponentsBuilder ucBuilder) {
//
//
//        userJDBCTemplate.create(user.getUsername(), user.getPassword(), user.getEmail(), user.getBirthday(), user.getProfession());
//
//        return Response.ok(user).build();
//    }

    @POST
    @Consumes("application/json")
    @Path("/createUser")
    public String createUser(@RequestBody User user, UriComponentsBuilder ucBuilder) {
        String response = "";

        userJDBCTemplate.create(user.getUsername(), user.getPassword(), user.getEmail(), user.getBirthday(), user.getProfession());
        response = Utils.constructJSON("created",true);
        return response;
    }
}
