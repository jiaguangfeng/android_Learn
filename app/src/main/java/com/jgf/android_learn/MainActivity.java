package com.jgf.android_learn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jgf.android_learn.Button.ButtonActivity;
import com.jgf.android_learn.EditText.EditTextActivity;
import com.jgf.android_learn.Login.LoginActivity;
import com.jgf.android_learn.ScrollView.ScrollViewActivity;
import com.jgf.android_learn.TextView.TextViewActivity;

public class MainActivity extends Activity implements View.OnClickListener {
    Button mButton_textview;
    Button mButton_button;
    Button  mButton_scrollview;
    Button mButton_edittext;
    Button mButton_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton_textview = (Button) findViewById(R.id.btn_textview);
        mButton_button = (Button) findViewById(R.id.btn_button);
        mButton_scrollview = (Button) findViewById(R.id.btn_scrollview);
        mButton_edittext= (Button) findViewById(R.id.btn_edittext);
        mButton_login= (Button) findViewById(R.id.btn_login);
        mButton_textview.setOnClickListener(this);
        mButton_button.setOnClickListener(this);
        mButton_scrollview.setOnClickListener(this);
        mButton_edittext.setOnClickListener(this);
        mButton_login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_textview:
                intentAction(TextViewActivity.class);
                break;
            case R.id.btn_button:
                intentAction(ButtonActivity.class);
                break;
            case R.id.btn_scrollview:
                intentAction(ScrollViewActivity.class);
                break;
            case R.id.btn_edittext:
                intentAction(EditTextActivity.class);
                break;
            case R.id.btn_login:
                intentAction(LoginActivity.class);
                break;

        }
    }

    private void intentAction(Class activity){
        Intent intent = new Intent(MainActivity.this, activity);
        startActivity(intent);
    }
}