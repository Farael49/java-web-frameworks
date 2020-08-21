package com.lab.follower.auth;

import com.lab.follower.profile.models.Profile;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {

    @PostMapping("/users/login")
    public AuthUser login(@RequestBody LoginUser loginUser){
        //get user in DB
        //set JWT
        return new AuthUser();
    }

    @PostMapping("/users")
    public AuthUser register(@RequestBody LoginUser loginUser){
        //persist user in DB
        return new AuthUser();
    }

}
