package com.sorrawit.homework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Toast toast = Toast.makeText(MainActivity.this , "Welcome to My ToDo application!" , Toast.LENGTH_LONG);
        toast.show();
    }
}
