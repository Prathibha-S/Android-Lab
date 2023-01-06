package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class Personal extends AppCompatActivity {
    EditText a1,a2,a3,a4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        a1=(EditText) findViewById(R.id.e1);
        a2=(EditText) findViewById(R.id.e2);
        a3=(EditText) findViewById(R.id.e3);
        a4=(EditText) findViewById(R.id.e4);

        SharedPreferences sh=getSharedPreferences("Sha1",MODE_PRIVATE);

        String w=sh.getString("name","");
        String x=sh.getString("pass","");
        String y=sh.getString("age","");
        String z=sh.getString("pho","");
        a1.setText(w);
        a2.setText(x);
        a3.setText(y);
        a4.setText(z);




    }
}