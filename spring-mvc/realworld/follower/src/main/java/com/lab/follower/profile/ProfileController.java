package com.lab.follower.profile;

import com.lab.follower.profile.models.Profile;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {

    @PostMapping("/{username}/follow")
    public Profile follow(@PathVariable String username){
        return new Profile();

    }
}
