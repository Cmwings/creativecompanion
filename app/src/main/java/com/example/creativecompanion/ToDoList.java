package com.example.creativecompanion;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ToDoList extends AppCompatActivity {

    private EditText typeEdt, brandEdt, descriptionEdt, sizeEdt, qtyEdit, websiteEdt;
    private MyDatabaseHelper MyDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list);


        typeEdt = findViewById(R.id.idEdtType);
        brandEdt = findViewById(R.id.idEdtBrand);
        descriptionEdt = findViewById(R.id.idEdtDescription);
        sizeEdt = findViewById(R.id.idEdtSize);
        qtyEdit = findViewById(R.id.idEdtQty);
        websiteEdt = findViewById(R.id.idEdtWebsite);
        Button addEntryBtn = findViewById(R.id.idBtnAddEntry);


        // creating database helper (instance)
        MyDatabaseHelper = new MyDatabaseHelper(ToDoList.this);

        addEntryBtn.setOnClickListener(v -> {

            String type = typeEdt.getText().toString();
            String brand = brandEdt.getText().toString();
            String description = descriptionEdt.getText().toString();
            String size = sizeEdt.getText().toString();
            Integer qty = Integer.valueOf(qtyEdit.getText().toString());
            String website = websiteEdt.getText().toString();

            //validating
            if (type.isEmpty() && brand.isEmpty() && description.isEmpty() && size.isEmpty()) {
                Toast.makeText(ToDoList.this, "Please enter all the data..", Toast.LENGTH_SHORT).show();
                return;
            }
            MyDatabaseHelper.addNewProduct(type, brand, description, size, qty, website);

            Toast.makeText(ToDoList.this, "Entry has been added.", Toast.LENGTH_SHORT).show();
            typeEdt.setText("");
            brandEdt.setText("");
            descriptionEdt.setText("");
            sizeEdt.setText("");
            qtyEdit.setText("");
            websiteEdt.setText("");
        });


    }



}