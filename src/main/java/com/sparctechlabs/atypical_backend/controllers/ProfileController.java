package com.sparctechlabs.atypical_backend.controllers;

import com.sparctechlabs.atypical_backend.models.UserProfile;
import com.sparctechlabs.atypical_backend.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/profiles")
public class ProfileController {
    private final ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @PostMapping
    public void addProfile(@RequestBody UserProfile userProfile) {
        profileService.addProfile(userProfile);
    }

    @PutMapping
    public void updateProfile(@RequestBody UserProfile userProfile) {
        profileService.updateProfile(userProfile);
    }

    @DeleteMapping("/{uuid}")
    public void deleteProfile(@PathVariable String uuid) {
        profileService.deleteProfile(uuid);
    }

    @GetMapping
    public List<UserProfile> getAllProfiles() {
        return profileService.getAllProfiles();
    }

    @GetMapping("/{uuid}")
    public UserProfile getProfile(@PathVariable String uuid) {
        return profileService.getProfile(uuid);
    }
}
