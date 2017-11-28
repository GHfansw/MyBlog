package com.laughingcrying.model;

import java.util.Date;
import java.util.List;

public class Artical {
    private String id;
    private String title;
    private String description;
    private String by;
    private List<String> tags;
    private int likes;
    private List<Comment> comments;
    private Date publishDate;
    private int views;

    public Artical() {
    }

    public Artical(String title, String description, String by, List<String> tags, int likes, List<Comment> comments, Date publishDate, int views) {
        this.title = title;
        this.description = description;
        this.by = by;
        this.tags = tags;
        this.likes = likes;
        this.comments = comments;
        this.publishDate = publishDate;
        this.views = views;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String toString(){
        return title+description;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
