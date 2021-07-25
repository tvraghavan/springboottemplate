package com.example.controller;

import com.example.model.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExampleController {

    @GetMapping("/version")
    public String version() {
        return "1.0";
    }

    @GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser() {
        return new User(1,"jsmith","ACTIVE");
    }

    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getUserList() {
        User user = new User(1, "jsmith", "ACTIVE");
        List<User> userList = new ArrayList<>();
        userList.add(user);

        return userList;
    }
}
