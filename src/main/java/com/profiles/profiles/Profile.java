package com.profiles.profiles;

import lombok.Builder;

@Builder
public class Profile {
    private String id;
    private String name;
    private String lastname;
    private Integer age;
    private String city;

    public Profile(String id, String name, String lastname, Integer age, String city) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
