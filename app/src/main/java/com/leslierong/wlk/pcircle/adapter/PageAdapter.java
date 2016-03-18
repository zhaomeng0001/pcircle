package com.leslierong.wlk.pcircle.adapter;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.leslierong.wlk.lastworld.R;

/**
 * Created by wlk-android on 2016/3/17.
 */
public class PageAdapter extends PagerAdapter implements View.OnClickListener {

    private Context context;

    private String [] imageUrls;



    public PageAdapter(Context context,String [] imageUrls){

        this.context = context;

        this.imageUrls = imageUrls;

    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View view = LayoutInflater.from(context).inflate(R.layout.zoom_image,null);

        ImageView imageView = (ImageView) view.findViewById(R.id.zoom);

        String imageUrl = imageUrls[position];

        Glide
                .with(context)
                .load(imageUrl)
                .placeholder(R.drawable.ic_launcher)
                .into(imageView);

        TextView textView = (TextView) view.findViewById(R.id.page);


        textView.setText(position+1+"/"+imageUrls.length);

        textView.setTextColor(context.getResources().getColor(R.color.white));

        FloatingActionButton left = (FloatingActionButton) view.findViewById(R.id.left_fab);

        left.setOnClickListener(this);

        FloatingActionButton right = (FloatingActionButton) view.findViewById(R.id.right_fab);

        right.setOnClickListener(this);

        container.addView(view);

        return view;
    }

    @Override
    public int getCount() {
        return imageUrls.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        View view = (View) object;

        container.removeView(view);

    }

    @Override
    public void onClick(View v) {


    }
}
