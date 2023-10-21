package com.example.creativecompanion;



import android.os.Bundle;
//import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
//import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
//import java.util.ArrayList;

public class Projects extends AppCompatActivity {

    private EditText projectEdt;
 //   ListView listView;
 //   MyDatabaseHelper dbHandler;

    private MyDatabaseHelper MyDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);

        projectEdt = findViewById(R.id.addProject);
        Button addEntryBtn = findViewById(R.id.idBtnAddEntry);


     //   listView = findViewById(R.id.projectList);

        MyDatabaseHelper = new MyDatabaseHelper(Projects.this);



        addEntryBtn.setOnClickListener(v -> {

            String project = projectEdt.getText().toString();

            if (project.isEmpty()) {
                Toast.makeText(Projects.this, "Please enter all the data..", Toast.LENGTH_SHORT).show();
                return;
            }

            MyDatabaseHelper.addNewProject(project);

            Toast.makeText(Projects.this, "Entry has been added.", Toast.LENGTH_SHORT).show();
            projectEdt.setText("");

        });


/*        dbHandler  =  new MyDatabaseHelper(this);
        ArrayList<String> list = dbHandler.getProject();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item, list);

        listView.setAdapter(adapter);
        */

    }
}