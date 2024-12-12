package org.example.spsapi.controller;

import org.apache.catalina.User;
import org.example.spsapi.data.dto.UserDto;
import org.example.spsapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user-api")

public class UserAuthController {

    private final UserService userService;

    @Autowired
    public UserAuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/product/{user_key}")
    public UserDto getUser(@PathVariable String user_key) {
       UserDto userDto = userService.getUserInfo(user_key);
       return userDto;
    }

}

 