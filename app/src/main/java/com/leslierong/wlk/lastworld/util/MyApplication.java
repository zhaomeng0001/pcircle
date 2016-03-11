package com.leslierong.wlk.lastworld.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wlk-android on 2016/3/10.
 */
public class MyApplication extends Application {

//    存储所有在Activity堆栈中的Activity
    private static List<Activity> activities;

//    存储是否是第一次登陆
    private static SharedPreferences sharedPreferences;

//    全局context;
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context = this;

        activities = new ArrayList<>();

        sharedPreferences = getSharedPreferences("LastWord",MODE_PRIVATE);

    }

    /**
     *
     * @return Activity堆栈容器
     */
    public static List<Activity> getActivities(){

        return activities;

    }

    /**
     *
     * @return 全局context
     */
    public static Context getContext(){

        return context;

    }

    /**
     *
     * @return 获取
     */
    public static SharedPreferences getPreferences(){

        return sharedPreferences;
    }


}
