package com.system_demo.system.models;

public class User {
    private String id;
    private String username;
    private String email;
    private String pass;
    private String displayName;
    private String bio;
    private int age;

    public User(String id, String username, String email, String pass, String displayName, String bio, int age, boolean admin){
        this.id = id;
        this.username = username;
        this.email = email;
        this.pass = pass;
        this.displayName = displayName;
        this.bio = bio;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}