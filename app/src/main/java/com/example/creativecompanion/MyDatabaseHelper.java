package com.example.creativecompanion;



import android.content.ContentValues;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;


import java.util.ArrayList;


public class MyDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "inventory.db";
    private static final int DATABASE_VERSION = 2;
    public static final String DATABASE_TABLE = "InventoryTable";
    public static final String DATABASE_TABLE2 = "ProjectTable";

    public static final String COL_2 = "Type";
    public static final String COL_3 = "Brand";
    public static final String COL_4 = "Description";
    public static final String COL_5 = "Size";
    public static final String COL_6 = "Qty";
    public static final String COL_7 = "Website";

    public static final String COL_2_T_2 = "WofText";


    public MyDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS " + DATABASE_TABLE + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, Type TEXT, Brand TEXT, Description TEXT, Size TEXT, Qty INTEGER, Website TEXT)");
        db.execSQL("CREATE TABLE IF NOT EXISTS " + DATABASE_TABLE2 + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, WofText TEXT)");
        }

    public void addNewProduct(String type, String brand, String description, String size, Integer qty, String website) {

        SQLiteDatabase db = this.getWritableDatabase();


        ContentValues values = new ContentValues();


        // Passing values
        values.put(COL_2, type);
        values.put(COL_3, brand);
        values.put(COL_4, description);
        values.put(COL_5, size);
        values.put(COL_6, qty);
        values.put(COL_7, website);

        // inserting data into database
        db.insert(DATABASE_TABLE, null, values);

        // closing database
        db.close();
    }

    public void addNewProject(String WofText) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();


        // Passing values
        values.put(COL_2_T_2, WofText);


        // inserting data into database
        db.insert(DATABASE_TABLE2, null, values);

        // closing database
        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Handle upgrade of database, this will delete all data
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE + ";");
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE2 + ";");


        onCreate(db);
    }


    public ArrayList<String> getInventory(String searchTerm) {
        ArrayList<String> list = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        String[] projection = {
                MyDatabaseHelper.COL_2,
                MyDatabaseHelper.COL_3,
                MyDatabaseHelper.COL_4,
                MyDatabaseHelper.COL_5,
                MyDatabaseHelper.COL_6,
                MyDatabaseHelper.COL_7
        };
        String selection = MyDatabaseHelper.COL_2 + " LIKE ?";
        String[] selectionArgs = {"%" + searchTerm + "%"};

        Cursor cursor = db.query(MyDatabaseHelper.DATABASE_TABLE, projection,
                selection,
                selectionArgs, null, null, null, null);

        while (cursor.moveToNext()){
            String column2Value = cursor.getString(cursor.getColumnIndexOrThrow(MyDatabaseHelper.COL_2));
            String col2Text = "Type: ";
            list.add(col2Text + column2Value);
            String column3Value = cursor.getString(cursor.getColumnIndexOrThrow(MyDatabaseHelper.COL_3));
            String col3Text = "Brand: ";
            list.add(col3Text + column3Value);
            String column4Value = cursor.getString(cursor.getColumnIndexOrThrow(MyDatabaseHelper.COL_4));
            String col4Text = "Description: ";
            list.add(col4Text + column4Value);
            String column5Value = cursor.getString(cursor.getColumnIndexOrThrow(MyDatabaseHelper.COL_5));
            String col5Text = "Size: ";
            list.add(col5Text + column5Value);
            String column6Value = cursor.getString(cursor.getColumnIndexOrThrow(MyDatabaseHelper.COL_6));
            String col6Text = "QTY: ";
            list.add(col6Text + column6Value);
            String column7Value = cursor.getString(cursor.getColumnIndexOrThrow(MyDatabaseHelper.COL_7));
            String col7Text = "Website: ";
            list.add(col7Text + column7Value);
            String colBreak = "-----------------------------------------";
            list.add(colBreak);


        }
        cursor.close();

        return list;


    }

    public ArrayList<String> getProject() {
        ArrayList<String> list = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        String[] projection = {
                MyDatabaseHelper.COL_2_T_2
        };

        Cursor cursor = db.query(MyDatabaseHelper.DATABASE_TABLE2, projection,
                null, null, null, null, null, null);

        while (cursor.moveToNext()){
            String column2Value = cursor.getString(cursor.getColumnIndexOrThrow(MyDatabaseHelper.COL_2_T_2));
            String col2Text = "Project: ";
            list.add(col2Text + column2Value);
            String colBreak = "-----------------------------------------";
            list.add(colBreak);
        }
        cursor.close();

        return list;
    }


}