package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    private TextView tv_name;
    private  TextView tv_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String pass = intent.getStringExtra("pwd");

        tv_name = (TextView) findViewById(R.id.tv_name);
        tv_pass = (TextView) findViewById(R.id.tv_pass);

        tv_name.setText("用户名："+name);
        tv_pass.setText("密码："+pass);
    }
}

