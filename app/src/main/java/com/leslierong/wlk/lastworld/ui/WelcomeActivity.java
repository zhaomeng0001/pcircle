package com.leslierong.wlk.lastworld.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import com.leslierong.wlk.lastworld.R;
import com.leslierong.wlk.lastworld.util.MyApplication;


/**
 * Created by wlk-android on 2016/3/1.
 */
public class WelcomeActivity extends BaseActivity{


    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        context = this;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if(MyApplication.getPreferences().getBoolean("isFirst",true)){

                    SharedPreferences.Editor editor = MyApplication.getPreferences().edit();

                    editor.putBoolean("isFirst", false);

                    editor.commit();

                    Intent intent = new Intent();

                    intent.setClass(context,IntroduceActivity.class);

                    startActivity(intent);

                }
                else{

                    Intent intent = new Intent();

                    intent.setClass(context,MainActivity.class);

                    startActivity(intent);

                }

            }
        },1500);

        finish();

    }
}
