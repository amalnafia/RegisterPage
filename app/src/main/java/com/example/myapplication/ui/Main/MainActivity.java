package com.example.myapplication.ui.Main;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavInflater;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

import com.example.myapplication.R;

import butterknife.BindView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);

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
        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController controller, @NonNull NavDestination destination,
                                             @Nullable Bundle arguments) {
                switch (destination.getId()) {
                    case R.id.signInFragment:
                        toolbar.setVisibility(View.GONE);
                }
            }
        });
    }

}
