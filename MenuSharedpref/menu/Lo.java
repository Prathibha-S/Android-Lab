package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class Lo extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2,e3,e4;
    Pattern na=Pattern.compile("^[A-Za-z]\\w{5,30}$");
    Pattern pa=Pattern.compile("^"+
            "(?=.*[@#$%^&+=])"+
            "(?=\\S+$)"+
            ".{4,}"+
            "$");
    Pattern ag=Pattern.compile("^"+
            "(?=\\S+$)"+
            "[0-9]{1,2}"+
            "$");
    Pattern p=Pattern.compile("^(0|91)?[7-9][0-9]{9}$");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lo);
        e1=(EditText) findViewById(R.id.editTextTextPersonName2);
        e2=(EditText) findViewById(R.id.editTextTextPassword);
        e3=(EditText) findViewById(R.id.editTextTextPersonName4);
        e4=(EditText) findViewById(R.id.editTextPhone);

        b1=(Button) findViewById(R.id.s1);
        b2=(Button) findViewById(R.id.r1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String name=e1.getText().toString();
                    String pass=e2.getText().toString();
                    String age=e3.getText().toString();
                    String pho=e4.getText().toString();
                    if(name.isEmpty()||age.isEmpty()||age.isEmpty()|pho.isEmpty()){
                        Toast.makeText(Lo.this, "Fields are Empty...", Toast.LENGTH_SHORT).show();
                    }
                    if(!na.matcher(name).matches()){
                        e1.setError("6-30 char");
                    }
                    if(!pa.matcher(pass).matches()){
                        e2.setError("Weak");
                    }
                    if(!ag.matcher(age).matches()){
                        e3.setError("Invalid");
                    }
                    if(!p.matcher(pho).matches()){
                        e4.setError("Invalid");
                    }
                    else{
                        Toast.makeText(Lo.this, "Loggedin successfully...", Toast.LENGTH_SHORT).show();
                        Intent i5=new Intent(getApplicationContext(),Personal.class);
                        startActivity(i5);
                        SharedPreferences sh=getSharedPreferences("Sha1",MODE_PRIVATE);
                        SharedPreferences.Editor edit=sh.edit();

                        edit.putString("name",e1.getText().toString());
                        edit.putString("pass",e2.getText().toString());
                        edit.putString("age",e3.getText().toString());
                        edit.putString("pho",e4.getText().toString());
                        edit.apply();
                        }
                    }



        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch ((item.getItemId())){
            case R.id.hh1:
                Toast.makeText(this, "Home...", Toast.LENGTH_SHORT).show();
                Intent i1=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i1);
                return  true;
            case R.id.h1:
                Toast.makeText(this, "Home...", Toast.LENGTH_SHORT).show();
                Intent i2=new Intent(getApplicationContext(),Lo.class);
                startActivity(i2);
                return  true;
            case R.id.a1:
                Toast.makeText(this, "Home...", Toast.LENGTH_SHORT).show();
                Intent i3=new Intent(getApplicationContext(),Se.class);
                startActivity(i3);
                return  true;


            default:
                return super.onOptionsItemSelected(item);
        }

    }
}