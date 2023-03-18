package com.github.parkhuiwo0.testcontainer.domain.impl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements com.github.parkhuiwo0.testcontainer.domain.User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private int age;

    private User(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    static User of(long id, String name, int age) {
        return new User(id, name, age);
    }

    protected User() {
        // empty.
    }

    public long id() {
        return id;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }
}
