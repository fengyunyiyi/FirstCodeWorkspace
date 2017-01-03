package com.ccgoogle.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String[] strings = {"apple","banana","orange","watermelon","pear","grape","pineapple","Strawberry",
    "cherry","orginer","aa","bbbb","ccc","ddd","eeee","ffff","eeeeeeggggg","qqqqqqqqq","rrrrrr","wwwww",
    "ppppppppp","mmmmmmmmm"};

    List<Fruit> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruit();

      //  ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.tv,strings);


        FruitAdapter fruitAdapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,list);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        //listView.setAdapter(adapter);
        listView.setAdapter(fruitAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = list.get(position);
                Toast.makeText(getApplicationContext(),"你点击了"+fruit.name,Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initFruit() {
        Fruit fruit = new Fruit();
        fruit.name="apple";
        fruit.imageId = R.mipmap.a9k;
        list.add(fruit);

        Fruit fruit1 = new Fruit();
        fruit1.name = "banana";
        fruit1.imageId = R.mipmap.a_1;
        list.add(fruit1);

        Fruit fruit2 = new Fruit();
        fruit2.name = "orange";
        fruit2.imageId = R.mipmap.a_5;
        list.add(fruit2);

        Fruit fruit3 = new Fruit();
        fruit3.name = "pear";
        fruit3.imageId = R.mipmap.a_7;
        list.add(fruit3);

        Fruit fruit4 = new Fruit();
        fruit4.name = "grape";
        fruit4.imageId = R.mipmap.a_8;
        list.add(fruit4);

        Fruit fruit5  = new Fruit();
        fruit5.name = "aaa";
        fruit5.imageId = R.mipmap.a_9;
        list.add(fruit5);

        Fruit fruit6 = new Fruit();
        fruit6.name = "bbb";
        fruit6.imageId = R.mipmap.a__;
        list.add(fruit6);

        Fruit fruit7 = new Fruit();
        fruit7.name = "ccccc";
        fruit7.imageId = R.mipmap.a_a;
        list.add(fruit7);

        Fruit fruit8 = new Fruit();
        fruit7.name = "ddddddddd";
        fruit7.imageId = R.mipmap.a_b;
        list.add(fruit8);

        Fruit fruit9 = new Fruit();
        fruit9.name = "fffffff";
        fruit9.imageId = R.mipmap.ac0;
        list.add(fruit9);

        Fruit fruit10 = new Fruit();
        fruit10.name = "eeeeeeeeee";
        fruit10.imageId = R.mipmap.ac1;
        list.add(fruit10);

        Fruit fruit11 = new Fruit("gouzao",R.mipmap.actionbar_camera_icon);
        list.add(fruit11);
    }


}
