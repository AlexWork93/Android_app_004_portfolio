package com.oleksii.android_app_004_portfolio;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerViewProjects = findViewById(R.id.recycler_view_projects);


        Project[] myProjects = {
                new Project("BMI calculator", "Calculates your body-mass-index to see if you are healthy", R.drawable.tape),
                new Project("Length converter", "Gives you an ability to enter any type of measurement and calculate to all provided types", R.drawable.calculator),
                new Project("Restaurant menu application", "Provides you with restaurant's menu with 3 separate categories of meals", R.drawable.hungry_developer)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(myProjects);
        recyclerViewProjects.setAdapter(adapter);
    }
}