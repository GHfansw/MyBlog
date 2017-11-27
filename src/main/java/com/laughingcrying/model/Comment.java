package com.laughingcrying.model;

import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Comment {
    public Comment(String user, String message, String date, int like) {
        this.id = id;
        this.user = user;
        this.message = message;
        this.date = date;
        this.like = like;
    }

    private String id;
    private String user;
    private String message;
    private String date;
    private int like;
//    private ConcurrentHashMap<String,String> map;

    public Comment(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }


//    public Comment(ConcurrentHashMap<String, String> map) {
//        this.map = map;
//    }
}
