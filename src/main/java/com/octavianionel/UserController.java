package com.octavianionel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by octavian on 2/20/17.
 */
@Controller
@RequestMapping(value = "/register")
public class UserController {

    @Resource
    private UserJDBCTemplate userJDBCTemplate;


    @RequestMapping(method = RequestMethod.GET)
    public String viewForm(Map<String, Object> model) {
        User userForm = new User();
        model.put("userForm", userForm);
        List<String> professionList = new ArrayList<String>();
        professionList.add("Java Developer");
        professionList.add("Designer");
        professionList.add("Android developer");
        professionList.add("Manager");
        model.put("professionList", professionList);

        return "Registration";
    }


    @RequestMapping(value = "/allUsers", method = RequestMethod.GET)
    public String listOfRegisteredUsers(ModelMap modelMap) {
        List<User> users = userJDBCTemplate.listOfUsers();
        modelMap.addAttribute("users", users);
        return "ListOfUsers";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("userForm")User user, Map<String, Object> model) {
        userJDBCTemplate.create(user.getUsername(), user.getPassword(), user.getEmail(), user.getBirthday(), user.getProfession());
        return "RegistrationSuccess";
    }
}
