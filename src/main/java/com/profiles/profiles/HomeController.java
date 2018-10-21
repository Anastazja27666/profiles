package com.profiles.profiles;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    public List<Profile> profiles = new ArrayList<>();

    @GetMapping("/getProfiles")
    public List<Profile> getProfile(){
        return profiles;
    }

    @PostMapping("/createProfile")
    public void createProfile(@RequestBody CreateProfileRequest request){
        Profile profile = Profile.builder()
                .name(request.getName())
                .build();
        profiles.add(profile);
    }

    @DeleteMapping("/removeProfile/{profileId}")
    public void removeProfile(@RequestParam String profileId){
        Profile profile = profiles.stream()
                .filter(p->p.getId().equals(profileId))
                .findFirst().get();
        profiles.remove(profile);
    }

}
