package com.ccgoogle.uilayouttest;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by chenjunlong on 2016/12/22.
 */

public class TitleLayout extends LinearLayout {
    public TitleLayout(final Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        Button title_back = (Button) findViewById(R.id.title_back);
        Button title_edit = (Button) findViewById(R.id.title_edit);
        title_back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });

        title_edit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"you clicked titleEdit Button",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
