package com.jgf.android_learn.TextView;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.jgf.android_learn.R;

public class TextViewActivity extends Activity {
    //声明控件
    TextView tv_01;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载layout （xml文件）
        setContentView(R.layout.activity_textview);
        //加载控件
        tv_01 = (TextView) findViewById(R.id.tv_01);
        //设置文字  适用于动态改变文字   如果文字不改变可以在xml中写
        tv_01.setText("TextViewActivity设置的文字");
        //设置文字颜色    多种颜色设置的方法
        tv_01.setTextColor(Color.RED);
//        tv_01.setTextColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));//使用colors.xml文件中的颜色
//        tv_01.setTextColor(new Integer(-12590395));//使用颜色的int类型值
//        tv_01.setTextColor(Color.parseColor("#000000"));//使用颜色的16进制类型值
        //这是文字的背景颜色
        tv_01.setBackgroundColor(Color.parseColor("#FFFFFF"));
        //设置字体大小
        tv_01.setTextSize(20);


    }
}
