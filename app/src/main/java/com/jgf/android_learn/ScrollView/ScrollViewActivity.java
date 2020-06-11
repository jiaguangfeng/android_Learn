package com.jgf.android_learn.ScrollView;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.jgf.android_learn.R;

public class ScrollViewActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorllview);
        //ScrollViewActivity 里面只能包一个view  但是包的view中 可以进行拓展
    }
}
