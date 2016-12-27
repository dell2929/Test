package com.example.dell.testprojforgit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_LONG).show();
        //Test comment ee//
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }
}
