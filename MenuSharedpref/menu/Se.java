package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Se extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_se);
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