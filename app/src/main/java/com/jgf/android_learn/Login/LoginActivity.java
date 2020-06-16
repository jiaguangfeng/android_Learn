package com.jgf.android_learn.Login;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.jgf.android_learn.R;

public class LoginActivity extends Activity {
    EditText ed_username;
    EditText ed_password;
    Button btn_login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ed_username = (EditText) findViewById(R.id.ed_username);
        ed_password = (EditText) findViewById(R.id.ed_password);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed_username.getText().toString().equals("111")&&ed_password.getText().toString().equals("111")){
                    Toast.makeText(LoginActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(LoginActivity.this,"登录失败",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
