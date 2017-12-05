package com.laughingcrying.model;

public class Account {
    private int id;
    private String accountId;
    private String username;
    private String password;
    private boolean isAdmin;

    public Account(String accountId, String username, String password, boolean isAdmin) {
        this.accountId = accountId;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public Account(String accountId, String password) {
        this.accountId = accountId;
        this.password = password;
    }
    public Account() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
