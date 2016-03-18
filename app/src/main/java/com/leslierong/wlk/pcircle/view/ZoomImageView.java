package com.leslierong.wlk.pcircle.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by wlk-android on 2016/3/17.
 */
public class ZoomImageView extends ImageView{
    public ZoomImageView(Context context) {
        this(context,null);
    }

    public ZoomImageView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ZoomImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
