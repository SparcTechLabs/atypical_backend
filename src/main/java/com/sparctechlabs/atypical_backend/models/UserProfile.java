package com.sparctechlabs.atypical_backend.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserProfile {
    private String gender;
    private String title;
    private String firstName;
    private String lastName;
    private String streetNumber;
    private String streetName;
    private String city;
    private String state;
    private String country;
    private String postcode;
    private String email;
    private String username;
    private String password;
    private String uuid;
    private LocalDate dob;
    private int age;
    private LocalDate registrationDate;
    private int registrationAge;
    private String phone;
    private String cell;
    private String pictureLargeUrl;
    private String pictureMediumUrl;
    private String pictureThumbnailUrl;
    private String nat;
}

