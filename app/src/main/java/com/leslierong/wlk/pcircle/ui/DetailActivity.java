package com.leslierong.wlk.pcircle.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;

import com.leslierong.wlk.lastworld.R;
import com.leslierong.wlk.pcircle.adapter.PageAdapter;


/**
 * Created by wlk-android on 2016/3/17.
 */
public class DetailActivity extends BaseActivity {


    private Context context;

    private int position;

    private String[] imageUrls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        Intent intent = getIntent();

        position = intent.getIntExtra("position", 0);

        imageUrls = intent.getStringArrayExtra("imageUrls");

        this.context = this;

        init();

    }

    private void init() {

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        PageAdapter adapter = new PageAdapter(context, imageUrls);

        viewPager.setAdapter(adapter);

        viewPager.setCurrentItem(position);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);

        return true;

    }

}