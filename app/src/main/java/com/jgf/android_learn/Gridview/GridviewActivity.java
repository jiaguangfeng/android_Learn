package com.jgf.android_learn.Gridview;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.jgf.android_learn.Listview.ListviewActivity;
import com.jgf.android_learn.R;

import java.util.ArrayList;
import java.util.List;

/**
 * ================================
 *
 * @ProjectName: android_Learn
 * @Package: com.jgf.android_learn.Gridview
 * @ClassName: GridviewActivity
 * @Description: java类作用描述
 * @Author: jiaguangfeng
 * @CreateDate: 2020/6/18 10:00 AM
 * @UpdateUser: 更新者：
 * @UpdateDate: 2020/6/18 10:00 AM
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 * ===================================
 */
public class GridviewActivity extends Activity {
    GridView gd_list;
    List<String> list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        gd_list = (GridView) findViewById(R.id.gd_list);
        list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add("天津" + i);
        }
        gd_list.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return list.size();
            }

            @Override
            public Object getItem(int position) {
                return list.get(position);
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                convertView = LayoutInflater.from(GridviewActivity.this).inflate(R.layout.listviewitem, null);
                TextView tv_item = convertView.findViewById(R.id.tv_item);
                tv_item.setText(list.get(position));
                return convertView;
            }
        });


    }
}
