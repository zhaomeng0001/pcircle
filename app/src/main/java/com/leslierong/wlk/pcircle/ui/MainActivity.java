package com.leslierong.wlk.pcircle.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.leslierong.wlk.lastworld.R;
import com.leslierong.wlk.pcircle.adapter.GridViewAdapter;

/**
 * Created by wlk-android on 2016/3/10.
 */
public class MainActivity extends BaseActivity{

    private Context context;

    private String [] imageUrls = new String[] {
            "http://img.my.csdn.net/uploads/201309/01/1378037152_6352.jpg",
            "http://img.my.csdn.net/uploads/201309/01/1378037151_9565.jpg",
            "http://img.my.csdn.net/uploads/201309/01/1378037151_7904.jpg",
            "http://img.my.csdn.net/uploads/201309/01/1378037148_7104.jpg",
            "http://img.my.csdn.net/uploads/201309/01/1378037129_8825.jpg",
            "http://img.my.csdn.net/uploads/201309/01/1378037128_5291.jpg",
            "http://img.my.csdn.net/uploads/201309/01/1378037128_3531.jpg",
            "http://img.my.csdn.net/uploads/201309/01/1378037127_1085.jpg",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        this.context = this;

        init();

    }

    private void init() {

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);

        ActionBar actionbar = getSupportActionBar();

        actionbar.setTitle("Pcircle");

        actionbar.setHomeAsUpIndicator(android.R.drawable.arrow_up_float);

        actionbar.setDisplayHomeAsUpEnabled(true);

        GridView gridView = (GridView) findViewById(R.id.gridView);

        GridViewAdapter adapter = new GridViewAdapter(context,R.layout.imageview,imageUrls);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent();

                intent.putExtra("position",position);

                intent.putExtra("imageUrls",imageUrls);

                intent.setClass(context,DetailActivity.class);

                startActivity(intent);

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case android.R.id.home:

                Log.i("fuck","hannanwan");

                break;


        }

        return true;

    }
}
