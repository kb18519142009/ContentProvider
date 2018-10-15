package com.example.kangbaibai.bookprovider.model;

/**
 * Created by kangbaibai on 2018/10/12.
 */

public class User {
    public int userId;
    public String userName;
    public boolean isMale;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", isMale=" + isMale +
                '}';
    }
}
