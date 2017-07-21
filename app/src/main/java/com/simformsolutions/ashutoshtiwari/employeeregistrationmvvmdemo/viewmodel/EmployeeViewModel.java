package com.simformsolutions.ashutoshtiwari.employeeregistrationmvvmdemo.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingConversion;
import android.view.View;
import android.widget.Toast;

import com.simformsolutions.ashutoshtiwari.employeeregistrationmvvmdemo.BR;
import com.simformsolutions.ashutoshtiwari.employeeregistrationmvvmdemo.model.Employee;

/**
 * Created by Ashutosh.tiwari on 19/07/17.
 * View Model class for wrapping the model and exposing the data to the attached view(s)
 */

public class EmployeeViewModel extends BaseObservable {

    private Context context;

    private Employee employee = new Employee();

    public EmployeeViewModel(Context context) {
        this.context = context;
    }

    //Custom getters annd setters for fetching or storing the model data
    @Bindable
    public String getId() {
        return employee.getId();
    }

    @Bindable
    public String getName() {
        return employee.getName();
    }

    public void setName(String name) {
        employee.setName(name);
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getSkill() {
        return employee.getSkill();
    }

    private void setSkill(String skill) {
        employee.setSkill(skill);
        notifyPropertyChanged(BR.skill);
    }

    @Bindable
    public String getContact() {
        return employee.getContact();
    }

    public void setContact(String contact) {
        employee.setContact(contact);
        notifyPropertyChanged(BR.contact);
    }

    @Bindable
    public boolean isRegistered() {
        return employee.isRegistered();
    }

    //Register the employee by creating an id
    public void onRegisterClicked() {
        /*
         This if is not required in case when we don't want to store the values or maintain the state
         This is just for the fact that we can entertain such functioning in future
         */
        if (!employee.isRegistered()) {
            employee.generateId();
            Toast.makeText(context, "Registration successful!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "User already exists! Check details again.", Toast.LENGTH_SHORT).show();
        }
        employee.setRegistered(true);
        notifyPropertyChanged(BR.registered);
    }

    public void checkChanged(int value) {
        if (value == 1) {
            setSkill("Android");
        }
        if (value == 2) {
            setSkill("IOS");
        }
    }

    /**
     * Custom converter for changing the type of the attribute
     * in our case to fetch the visibility value based on the changing value of the boolean isRegistered [in XML]
     */
    @BindingConversion
    public static int setVisibility(boolean visibility) {
        return visibility ? View.VISIBLE : View.GONE;
    }
}