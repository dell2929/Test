package com.example.dell.testprojforgit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/{
    // WORK_BR3  tttt

    TextView tv;
    TextView tv2;

   /* @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_LONG).show();
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
