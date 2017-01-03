package com.ccgoogle.firstactivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * Created by chenjunlong on 2016/12/21.
 */

public class SecondActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // Log.d("SecondActivity",this.toString());
        Log.d("SecondActivity","Task id is" + getTaskId());
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.second_activity);

     /*   final Intent intent = getIntent();
        String extra_data = intent.getStringExtra("extra_data");
        Log.v("SecondActivity",extra_data);*/

        Button button = (Button) findViewById(R.id.button_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*  Intent intent1 = new Intent();
                intent1.putExtra("data2","Hello FirstActivity,这是SecondActivity返回给你的数据");
                setResult(RESULT_OK,intent1);
                finish();*/

              /*  Intent intent1 = new Intent(SecondActivity.this,FirstActivity.class);
                startActivity(intent1);*/

                Intent intent1 = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent1);

            }
        });

    }

    public static void actionStart(Context context,String data1,String data2){
        Intent intent = new Intent(context,SecondActivity.class);
        intent.putExtra("name1",data1);
        intent.putExtra("name2",data2);
        context.startActivity(intent);
    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data1","这是按返回键返回的数据");
        setResult(3,intent);
        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SecondActivity","onDestroy");
    }
}
