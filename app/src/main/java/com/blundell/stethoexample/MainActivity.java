package com.blundell.stethoexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExampleDatabaseHelper databaseHelper = new ExampleDatabaseHelper(this);
        List<String> names = Arrays.asList("bart", "lisa", "homer", "marge", "maggie");
        List<String> roles = Arrays.asList("son", "daughter", "dad", "mum", "baby");
        databaseHelper.insert(names, roles);
    }
}
