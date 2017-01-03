package com.ccgoogle.activitylifecycletest;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by chenjunlong on 2016/12/21.
 */

public class NormalActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);
    }
}
