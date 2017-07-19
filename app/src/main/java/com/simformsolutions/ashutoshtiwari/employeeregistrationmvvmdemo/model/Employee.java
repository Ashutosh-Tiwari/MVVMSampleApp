package com.simformsolutions.ashutoshtiwari.employeeregistrationmvvmdemo.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.simformsolutions.ashutoshtiwari.employeeregistrationmvvmdemo.BR;

/**
 * Created by Ashutosh.tiwari on 19/07/17.
 */

public class Employee extends BaseObservable {

    private int id;
    private String name;
    private String skill;
    private long contact;
    private boolean isRegistered;

    public Employee(int id, String name, long contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    @Bindable
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
        notifyPropertyChanged(BR.skill);
    }

    @Bindable
    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
        notifyPropertyChanged(BR.contact);
    }

    @Bindable
    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
        notifyPropertyChanged(BR.registered);
    }
}
