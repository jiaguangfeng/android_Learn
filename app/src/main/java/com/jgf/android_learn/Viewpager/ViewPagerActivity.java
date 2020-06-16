package com.jgf.android_learn.Viewpager;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import com.jgf.android_learn.R;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerActivity extends Activity {

    ViewPager vp_viewpager;
    List<View> mViewList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);
        vp_viewpager = (ViewPager) findViewById(R.id.vp_viewpager);
        mViewList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            //实际使用中这个可以是加载自己自定义的xml
            Button button = new Button(this);
            button.setText("这是第" + i + "个按钮");
            mViewList.add(button);
        }
        //列表的控件都要有自己的适配器 adapter类
        vp_viewpager.setAdapter(new AdapterViewpager(mViewList));


    }
}
