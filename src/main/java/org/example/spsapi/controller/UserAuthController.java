package org.example.spsapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user-api")

public class UserAuthController {
    @GetMapping(value = "/userinfo/{user_key}")
    public int getuserinfo(@PathVariable("user_key") int user_key){
        return  user_key  ;
    }

}
