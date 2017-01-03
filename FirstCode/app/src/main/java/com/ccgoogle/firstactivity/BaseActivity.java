package com.ccgoogle.firstactivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by chenjunlong on 2016/12/21.
 */

public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("BaseActivity",getClass().getSimpleName());
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
        Log.v("BaseActivity",getClass().getSimpleName()+"销毁了");
    }
}
