package com.leslierong.wlk.pcircle.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.leslierong.wlk.pcircle.util.MyApplication;

/**
 * Created by wlk-android on 2016/3/10.
 */
public class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        MyApplication.getActivities().add(this);


    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        MyApplication.getActivities().remove(this);

    }


    /**
     * 任意界面退出该APP
     */
    protected void exitApp(){

        for (Activity activity : MyApplication.getActivities()){

            activity.finish();

        }

        MyApplication.getActivities().clear();

        System.exit(0);

    }

}
