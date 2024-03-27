package com.sparctechlabs.atypical_backend.services;

import com.sparctechlabs.atypical_backend.models.UserProfile;

import java.util.List;

public interface ProfileService {
    void addProfile(UserProfile userProfile);
    void updateProfile(UserProfile updatedUserProfile);
    void deleteProfile(String uuid);
    List<UserProfile> getAllProfiles();
    UserProfile getProfile(String uuid);
}

