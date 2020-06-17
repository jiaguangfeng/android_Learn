package com.jgf.android_learn.Listview;


import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.jgf.android_learn.R;

import java.util.ArrayList;
import java.util.List;

public class ListviewActivity extends Activity {
    ListView liv_listview;
    List<String> array;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        liv_listview = (ListView) findViewById(R.id.liv_listview);
        array=new ArrayList();
        for (int i = 0; i <30 ; i++) {
            array.add("11111");
        }


        liv_listview.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return array.size();
            }

            @Override
            public Object getItem(int position) {
                return array.get(position);
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                convertView = LayoutInflater.from(ListviewActivity.this).inflate(R.layout.listviewitem, null);
                TextView tv_item =convertView.findViewById(R.id.tv_item);
                tv_item.setText(array.get(position));
                return convertView;
            }
        });
    }
}
