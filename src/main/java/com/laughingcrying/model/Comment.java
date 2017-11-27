package com.laughingcrying.model;

import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Comment {
//    private String user;
//    private String message;
//    private Date date;
//    private int like;
    private ConcurrentHashMap<String,String> map;

    public Comment(){

    }


    public Comment(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }
}
