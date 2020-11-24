package com.example.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //find the bottom navigation view
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);


        //finding the NavController
        NavController navController = Navigation.findNavController(this,R.id.nav_host_fragment);


        //setting bottomNavigation view with navigation component
        NavigationUI.setupWithNavController(bottomNavigationView,navController);
    }
}