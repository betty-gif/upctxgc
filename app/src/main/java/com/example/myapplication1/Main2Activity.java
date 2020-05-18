package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText et_pwd;
    private  EditText et_name;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et_name = (EditText) findViewById(R.id.et_name);
        et_pwd = (EditText) findViewById(R.id.et_pwd);
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passDate();
            }
        });
    }

    //数据传递
    public void passDate(){
        //创建Intent对象,启动第二个界面
        Intent intent = new Intent(this,ShowActivity.class);

        //上货（需要传递的数据）
        intent.putExtra("name",et_name.getText().toString().trim());
        intent.putExtra("pwd",et_pwd.getText().toString().trim());
        startActivity(intent);
    }
}

