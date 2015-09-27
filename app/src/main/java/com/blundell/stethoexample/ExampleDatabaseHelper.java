package com.blundell.stethoexample;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.List;

class ExampleDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "ExampleDatabase";
    private static final int VERSION = 1;

    public ExampleDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL("CREATE TABLE IF NOT EXISTS places (id INTEGER PRIMARY KEY, name TEXT)");
        database.execSQL("CREATE TABLE IF NOT EXISTS people (id INTEGER PRIMARY KEY, name TEXT, role TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        throw new IllegalStateException("Not expecting an upgrade from" + oldVersion + "to " + newVersion);
    }

    public void insert(final List<String> names, final List<String> roles) {
        SQLiteDatabase database = getWritableDatabase();
        ContentValues values = new ContentValues();
        for (int i = 0; i < 5; i++) {
            values.put("name", names.get(i));
            values.put("role", roles.get(i));
            database.insert("people", null, values);
        }
        database.close();
    }
}
