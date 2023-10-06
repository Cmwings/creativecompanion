package com.example.creativecompanion;
import android.content.ContentValues;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;


public class MyDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "inventory.db";
    private static final int DATABASE_VERSION = 1;
    public static final String DATABASE_TABLE = "InventoryTable";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "Type";
    public static final String COL_3 = "Brand";
    public static final String COL_4 = "Description";
    public static final String COL_5 = "Size";
    public static final String COL_6 = "Qty";
    public static final String COL_7 = "Website";


    public MyDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS " + DATABASE_TABLE + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, Type TEXT, Brand TEXT, Description TEXT, Size TEXT, Qty INTEGER, Website TEXT)");
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

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    // Handle upgrade of database, this will delete all data
    db.execSQL("DROP TABLE IF EXISTS DATABASE_TABLE;");
    onCreate(db);
    }
}

