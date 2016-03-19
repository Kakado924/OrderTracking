package com.ordertracking.bean;

/**
 * Created by chlei on 2016/3/6.
 */
public class User {
    private int id;
    private String name;
    private String password;
    private int authority;

    public User(int id, String name, String password, int authority) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.authority = authority;
    }

    public User() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", authority=" + authority +
                '}';
    }
}
