package com.system_demo.system.models;

public class User {
    private String username;
    private String email;
    private String pass;
    private String displayName;
    private String bio;
    private int age;
    private boolean admin;

    public User(String username, String email, String pass, String displayName, String bio, int age, boolean admin){
        this.username = username;
        this.email = email;
        this.pass = pass;
        this.displayName = displayName;
        this.bio = bio;
        this.age = age;
        this.admin = admin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = getEmail();
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass){
        this.pass = pass;
    }

    public String getDisplayName(){
        return displayName;
    }

    public void setDisplayName(String displayName){
        this.displayName = displayName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}