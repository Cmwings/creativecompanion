package com.example.creativecompanion;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
public class Tools extends AppCompatActivity {
    String search = "Tools";
    ListView listView;
    MyDatabaseHelper dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        listView = findViewById(R.id.user_list);
        dbHandler = new MyDatabaseHelper(this);

        ArrayList<String> list = dbHandler.getInventory(search);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item, list);

        listView.setAdapter(adapter);
    }
}