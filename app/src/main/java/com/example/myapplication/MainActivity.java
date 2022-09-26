package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView username =(TextView) findViewById(R.id.username);
        final TextView password =(TextView) findViewById(R.id.password);

        Button loginBtn = (Button) findViewById(R.id.loginBtn);

        //admin and admin
        loginBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                   //correct
                   Toast.makeText(MainActivity.this, "Login Successfuly",Toast.LENGTH_SHORT).show();
               }else
                   //incorrect
                   Toast.makeText(MainActivity.this, "Login Failed",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
