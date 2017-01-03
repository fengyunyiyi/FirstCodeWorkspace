package com.ccgoogle.firstactivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by chenjunlong on 2016/12/21.
 */

public class FirstActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // Log.d("FirstActivity",this.toString());
        Log.d("FirstActivity","Task id is"+ getTaskId());
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.first_layout);
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this, "You clicked Button 1", Toast.LENGTH_SHORT).show();
             /*   Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(intent);*/

            /*    Intent intent = new Intent("com.ccgoogle.firstactivity.ACTION_START");
                intent.addCategory("com.ccgoogle.firstactivity.MY_CATEGORY");
                startActivity(intent);*/

               /* Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.ccgoogle.com"));
                startActivity(intent);*/

//                Intent intent = new Intent(Intent.ACTION_CALL);
               /* Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);*/

            /*    String data = "Hello SecondActivity";
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("extra_data",data);
                startActivity(intent);*/

               /* String data = "HelloSecondActivity";
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("extra_data","Hello ScecondActivity");
                startActivityForResult(intent,1);*/

                /*Intent intent = new Intent(FirstActivity.this,FirstActivity.class);
                startActivity(intent);*/

               /* Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);*/

                SecondActivity.actionStart(FirstActivity.this,"data1","data2");

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                if (resultCode==RESULT_OK){
                    String extra = data.getStringExtra("data2");
                    Log.v("FirstActivity",extra);
                }else if(resultCode==3){
                    String stringExtra = data.getStringExtra("data1");
                    Log.v("FirstActivity",stringExtra);
                }

                break;
            default:
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "You clicked add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You clicked remove", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;
    }

    public void Click1(View view) {
        finish();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("FirstActivity","onRestart");
    }
}
