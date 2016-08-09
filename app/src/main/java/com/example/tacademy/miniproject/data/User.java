package com.example.tacademy.miniproject.data;

/**
 * Created by Tacademy on 2016-08-09.
 */
public class User {
    private long id;
    private String userName;
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return userName;
    }
}
