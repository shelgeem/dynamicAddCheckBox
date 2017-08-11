package com.example.luxiaoju.addcheckbox;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private ViewGroup ll_root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll_root = (ViewGroup) findViewById(R.id.ll_view_root);
        List<String> data = dataList();
        for (int i=0;i<data.size();i++ ) {
            String s1 = data.get(i);

            String s2 = null;
            i++;
            if (i < data.size()) {
                s2 = data.get(i);
            }
            addCheckBoxView(MainActivity.this,getLayoutInflater(),ll_root,s1,s2);
        }

    }

    public List<String> dataList() {
        List<String> strList = new ArrayList<>();
        String s1 = "代办事务";
        strList.add(s1);

        String s2 = "工作通知时尚谁是非得失";
        strList.add(s2);

        String s3 = "提醒通知";
        strList.add(s3);

        String s4 = "提醒事务2";
        strList.add(s4);

        String s5 = "其他";
        strList.add(s5);

        return  strList;
    }


    public List<Map<String,String>> initData(List<String> strList) {
        List<Map<String,String>> mapList = new ArrayList<>();
        if (strList != null && strList.size() >0) {
            for (String str:strList) {

            }
        }
        return null;
    }
    public void addCheckBoxView(Context context, LayoutInflater inflater, ViewGroup parent, String s1,String s2) {
        View itemView = inflater.inflate(R.layout.activity_main_check_item,parent,false);
        CheckBox cb = (CheckBox) itemView.findViewById(R.id.checkbox_one);
        CheckBox cb1 = (CheckBox) itemView.findViewById(R.id.checkbox_two);
        TextView tv1 = (TextView) itemView.findViewById(R.id.tv_1);
        TextView tv2 = (TextView) itemView.findViewById(R.id.tv_2);
        tv1.setText(s1);
        tv2.setText(s2);

        cb.setChecked(true);
        cb1.setChecked(true);
        if (s2 == null) {
            cb1.setVisibility(View.INVISIBLE);
            tv2.setVisibility(View.INVISIBLE);
        }

        parent.addView(itemView);
    }
}
