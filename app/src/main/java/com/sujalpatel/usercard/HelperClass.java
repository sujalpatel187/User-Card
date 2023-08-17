package com.sujalpatel.usercard;

public class HelperClass {
    String userId,name,email,position,password;

    public HelperClass(String userId, String name, String email, String position, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.position = position;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HelperClass() {
    }
}
