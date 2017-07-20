package com.simformsolutions.ashutoshtiwari.employeeregistrationmvvmdemo.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.simformsolutions.ashutoshtiwari.employeeregistrationmvvmdemo.R;
import com.simformsolutions.ashutoshtiwari.employeeregistrationmvvmdemo.databinding.ActivityMainBinding;
import com.simformsolutions.ashutoshtiwari.employeeregistrationmvvmdemo.viewmodel.EmployeeViewModel;


public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EmployeeViewModel viewModel = new EmployeeViewModel(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setEmployeeViewModel(viewModel);
    }
}