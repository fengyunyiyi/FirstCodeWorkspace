package com.ccgoogle.uiwidgettest;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.edit_text);
        imageView = (ImageView) findViewById(R.id.image_view);
        button.setOnClickListener(this);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        progressBar1 = (ProgressBar) findViewById(R.id.progressBar);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:

                imageView.setImageResource(R.mipmap.aa);

                String editString = editText.getText().toString().trim();
                Toast.makeText(getApplicationContext(),editString,Toast.LENGTH_SHORT).show();
                break;
            case R.id.button1:
               /* if(progressBar1.getVisibility()==View.GONE){
                    progressBar1.setVisibility(View.VISIBLE);
                }else{
                    progressBar1.setVisibility(View.GONE);
                }*/

                /*int progress = progressBar1.getProgress()+10;
                progressBar1.setProgress(progress);*/


           /*     AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("您得网络有问题");
                builder.setMessage("请确认网络");
                builder.setCancelable(false);
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.show();*/

                ProgressDialog progressDialog = new ProgressDialog(this);
                progressDialog.setTitle("This is a ProgressDialog");
                progressDialog.setMessage("Loading....");
                progressDialog.setCancelable(true);
                progressDialog.show();

                break;
            default:
                break;
        }
    }
}
