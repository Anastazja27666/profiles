package com.profiles.profiles;

import lombok.Builder;

@Builder
public class CreateProfileRequest {
    private String name;
    private String lastname;
    private Integer age;
    private String city;

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Integer getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}
