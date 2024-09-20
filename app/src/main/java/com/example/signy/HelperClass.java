package com.example.signy;

public class HelperClass {

    String name, email, username, password;

    public HelperClass(String name, String email, String username, String password) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }

//    public HelperClass(String password, String username, String email, String name) {
//        this.password = password;
//        this.username = username;
//        this.email = email;
//        this.name = name;
//    } // This was your mistake, you defined the constructor wrong !!


    public HelperClass() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
