package com.leslierong.wlk.lastworld.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.leslierong.wlk.lastworld.util.MyApplication;

/**
 * Created by wlk-android on 2016/3/10.
 */
public class BaseActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

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
