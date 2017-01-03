package com.ccgoogle.activitylifecycletest;

import android.content.Intent;
import android.nfc.Tag;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            String  data_key = savedInstanceState.getString("data_key");
            Log.v(TAG, data_key);
            Toast.makeText(this, "取出的数据是：" + data_key, Toast.LENGTH_SHORT).show();
        }

        Log.v(TAG, "onCreate");
        Button start_dialog = (Button) findViewById(R.id.start_dialog_activity);
        Button start_normal = (Button) findViewById(R.id.start_normal_activity);
        start_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DialogActivity.class);
                startActivity(intent);
            }
        });

        start_normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NormalActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String data = "这是Acitivity被销毁前的数据";
        outState.putString("data_key", data);
    }

    @Override
    protected void onStart() {
        Log.v(TAG, "onStrat");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.v(TAG, "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.v(TAG, "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.v(TAG, "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.v(TAG, "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.v(TAG, "onRestart");
        super.onRestart();
    }
}
