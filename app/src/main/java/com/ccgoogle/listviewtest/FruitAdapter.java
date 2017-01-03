package com.ccgoogle.listviewtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by chenjunlong on 2016/12/22.
 */

public class FruitAdapter extends ArrayAdapter {

    private final int resourceS;
    private View view;

    public FruitAdapter(Context context, int resource, List<Fruit> objects) {
        super(context, resource, objects);
        resourceS = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit  = (Fruit) getItem(position);
        ViewHolder viewHolder;
        if(convertView==null){
            view = LayoutInflater.from(getContext()).inflate(resourceS, null);
            viewHolder = new ViewHolder();
            viewHolder.holderImageView = (ImageView) view.findViewById(R.id.fruit_image);
            viewHolder.holderTextView = (TextView) view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);
        }else{
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.holderImageView.setImageResource(fruit.imageId);
        viewHolder.holderTextView.setText(fruit.name);
        return view;
    }
    class ViewHolder{
        ImageView holderImageView;
        TextView holderTextView;
    }

}
