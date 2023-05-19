package com.Geekster.UserManagementSystem_AwsTesting.Controller;

import com.Geekster.UserManagementSystem_AwsTesting.Model.User;
import com.Geekster.UserManagementSystem_AwsTesting.Repository.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserDao userDao;

    @GetMapping("/home")
    public String welcomePage(){
        return "Welcome to User Management System";
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        userDao.save(user);
        return "User saved successfully";
    }

    @GetMapping("/getUser")
    public List<User> getUsers(){
        return userDao.findAll();
    }

}
