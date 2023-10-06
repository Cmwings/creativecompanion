package com.example.creativecompanion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Load the UI layout
        // setting up buttons
        Button mediumButton = findViewById(R.id.Medium);
        Button colorButton = findViewById(R.id.color);
        Button ideaButton = findViewById(R.id.idea);
        Button paperButton = findViewById(R.id.Paper);
        Button drawingButton = findViewById(R.id.Drawing);
        Button canvasButton = findViewById(R.id.Canvas);
        Button toolsButton = findViewById(R.id.Tools);
        Button projectsButton = findViewById(R.id.Projects);
        Button moodButton = findViewById(R.id.Mood);
        Button favoriteButton = findViewById(R.id.favorites);
        Button todoButton = findViewById(R.id.todolist);

        //on click listener to open new pages
        mediumButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Medium.class)));
        ideaButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Idea.class)));
        colorButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ColorPalette.class)));
        paperButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Paper.class)));
        drawingButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Drawing.class)));
        canvasButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Canvas.class)));
        toolsButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Tools.class)));
        projectsButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Projects.class)));
        moodButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Mood.class)));
        favoriteButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Favorites.class)));
        todoButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ToDoList.class)));
    }
}