package com.example.myapplication.ui.Main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import androidx.navigation.NavInflater;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;

import com.example.myapplication.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        RegisterFragment registerFragment = new RegisterFragment();
//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.home_nav_host, registerFragment, registerFragment.getClass().getSimpleName()).
//                addToBackStack(null).commit();
//

        NavHostFragment navHost = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.home_nav_host);
        NavController navController = navHost.getNavController();
        NavInflater navInflater = navController.getNavInflater();
        NavGraph graph = navInflater.inflate(R.navigation.register_navigation);
        graph.setStartDestination(R.id.registerFragment);
        navController.setGraph(graph);

    }

}
