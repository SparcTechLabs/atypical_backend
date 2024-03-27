package com.sparctechlabs.atypical_backend.services.impl;

import com.sparctechlabs.atypical_backend.models.UserProfile;
import com.sparctechlabs.atypical_backend.services.ProfileService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService {
    private final List<UserProfile> userProfiles;

    public ProfileServiceImpl() {
        this.userProfiles = new ArrayList<>();
    }

    @Override
    public void addProfile(UserProfile userProfile) {
        userProfiles.add(userProfile);
    }

    @Override
    public void updateProfile(UserProfile updatedProfile) {
        for (UserProfile profile : userProfiles) {
            if (profile.getUuid().equals(updatedProfile.getUuid())) {
                userProfiles.set(userProfiles.indexOf(profile), updatedProfile);
                break;
            }
        }
    }

    @Override
    public void deleteProfile(String uuid) {
        userProfiles.removeIf(profile -> profile.getUuid().equals(uuid));
    }

    @Override
    public List<UserProfile> getAllProfiles() {
        return userProfiles;
    }

    @Override
    public UserProfile getProfile(String uuid) {
        for (UserProfile profile : userProfiles) {
            if (profile.getUuid().equals(uuid)) {
                return profile;
            }
        }
        return null;
    }
}

