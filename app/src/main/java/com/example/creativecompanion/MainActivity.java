package com.example.creativecompanion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // setting up buttons
        ImageButton mediumButton = findViewById(R.id.Medium);
        ImageButton colorButton = findViewById(R.id.color);
        ImageButton ideaButton = findViewById(R.id.idea);
        ImageButton paperButton = findViewById(R.id.Paper);
        ImageButton drawingButton = findViewById(R.id.Drawing);
        ImageButton canvasButton = findViewById(R.id.Canvas);
        ImageButton toolsButton = findViewById(R.id.Tools);
        ImageButton projectsButton = findViewById(R.id.Projects);
        ImageButton moodButton = findViewById(R.id.Mood);
        ImageButton favoriteButton = findViewById(R.id.favorite);
        ImageButton todoButton = findViewById(R.id.todolist);

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
        favoriteButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Favorite.class)));
        todoButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ToDoList.class)));
    }
}