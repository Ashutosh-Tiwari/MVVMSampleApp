package com.simformsolutions.ashutoshtiwari.employeeregistrationmvvmdemo.model;

import java.util.Random;

/**
 * Created by Ashutosh.tiwari on 19/07/17.
 * Simple POJO Model to store or retrieve attributes specific to an Employee
 */

public class Employee {

    private String id;
    private String name;
    private String skill;
    private String contact;
    private boolean isRegistered;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    public void generateId() {
        id = String.valueOf(new Random(3));
    }
}