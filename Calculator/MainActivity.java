package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText first,second;
    Button add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=(EditText)findViewById(R.id.t1);
        second=(EditText)findViewById(R.id.t2);
        add=(Button)findViewById(R.id.button);
        sub=(Button)findViewById(R.id.button2);
        mul=(Button)findViewById(R.id.button3);
        div=(Button)findViewById(R.id.button4);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(first.getText().toString());
                float b = Float.parseFloat(n2.getText().toString());
                ans=a+b;
                Toast.makeText(MainActivity.this,"The sum is "+ans,Toast.LENGTH_SHORT).show();
            }
        });

    }
}