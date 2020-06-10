package com.jgf.android_learn.Button;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.jgf.android_learn.R;

public class ButtonActivity extends Activity {
    Button btn_button01;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        btn_button01=(Button)findViewById(R.id.btn_button01);
    }
}
