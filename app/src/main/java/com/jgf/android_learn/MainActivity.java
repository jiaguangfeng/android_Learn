package com.jgf.android_learn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jgf.android_learn.TextView.TextViewActivity;

public class MainActivity extends Activity implements View.OnClickListener {
    Button mButton_textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton_textview = (Button) findViewById(R.id.btn_textview);
        //这里是完整点击监听的方法  因为有多个按钮点击 所以重写一下onClick 方法 根据不同的按钮id 跳转不同的页面
//        mButton_textview.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
        mButton_textview.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_textview:
                //点击跳转到textviewactivity 中    所有的activity必须加载到androidmainifast.xml 中
                Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
                startActivity(intent);
                break;

        }
    }
}