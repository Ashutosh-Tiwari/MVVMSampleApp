package com.simformsolutions.ashutoshtiwari.employeeregistrationmvvmdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.simformsolutions.ashutoshtiwari.employeeregistrationmvvmdemo.databinding.ActivityMainBinding;
import com.simformsolutions.ashutoshtiwari.employeeregistrationmvvmdemo.model.Employee;
import com.simformsolutions.ashutoshtiwari.employeeregistrationmvvmdemo.viewmodel.EmployeeViewModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Employee employee;
    private EmployeeViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setEmployee(employee);
        binding.setEmployee_view_model(viewModel);
    }
}
