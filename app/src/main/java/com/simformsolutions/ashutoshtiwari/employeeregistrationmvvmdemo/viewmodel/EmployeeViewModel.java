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
 * View Model
 */

public class EmployeeViewModel extends BaseObservable {

    private Context context;

    private Employee employee = new Employee();

    public EmployeeViewModel() {
    }

    public EmployeeViewModel(Context context) {
        this.context = context;
    }

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


    public void onRegisterClicked() {
        if (!employee.isRegistered()) {
            employee.generateId();
            Toast.makeText(context, "Registration successfull!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "User already exists! Check details again", Toast.LENGTH_SHORT).show();
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

    @BindingConversion
    public static int setVisibility(boolean visibility) {
        return visibility ? View.VISIBLE : View.GONE;
    }
}