package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"You are inside onCreate() method", Toast.LENGTH_SHORT).show();
    }
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(),"You are inside onStart() method",Toast.LENGTH_SHORT).show();
    }
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(),"You are inside onResume() method", Toast.LENGTH_SHORT).show();
    }
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(),"You are inside onPause() method", Toast.LENGTH_SHORT).show();
    }
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(getApplicationContext(),"You are inside onRestart() method", Toast.LENGTH_SHORT).show();
    }
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(),"You are inside onStop() method", Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"You are inside onDestroy() method", Toast.LENGTH_SHORT).show();
    }
}
