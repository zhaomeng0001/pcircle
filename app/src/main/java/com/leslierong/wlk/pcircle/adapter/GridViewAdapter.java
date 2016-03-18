package com.leslierong.wlk.pcircle.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.leslierong.wlk.lastworld.R;

/**
 * Created by wlk-android on 2016/3/16.
 */
public class GridViewAdapter extends ArrayAdapter<String>{

    private Context context;

    public GridViewAdapter(Context context, int resource, String[] objects) {
        super(context, resource, objects);

        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){

            LayoutInflater inflater = LayoutInflater.from(context);

            convertView = inflater.inflate(R.layout.imageview,null).findViewById(R.id.item_image);

        }

        Glide
                .with(context)
                .load(getItem(position))
                .placeholder(R.drawable.ic_launcher)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into((ImageView) convertView);

        Log.i("fuck",getItem(position));

        return convertView;
    }
}
