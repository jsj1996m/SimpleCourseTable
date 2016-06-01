package com.tmachine.i.coursetable;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.tmachine.i.coursetable.tools.Rotate3dAnimation;

/**
 * Created by jsj1996m on 2016/6/1.
 */
public class CourseView extends RelativeLayout implements View.OnClickListener{
    TextView frontPage;
    TextView backPage;

    public CourseView(Context context){
        super(context);
    }
    public CourseView(Context context, AttributeSet attrs, int defStyleAttr){
        super(context,attrs,defStyleAttr);
        initView(context);
    }
    public CourseView(Context context, AttributeSet attrs){
        super(context,attrs);
        initView(context);

    }

    private void initView(Context context){
        frontPage = new TextView(context);
        frontPage.setText("sasfjashdfkjashdfk");
        frontPage.setId(frontPage.generateViewId());
        backPage = new TextView(context);
        backPage.setText("safkashfkhj");
        backPage.setId(backPage.getImeActionId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        layoutParams.addRule(RelativeLayout.CENTER_VERTICAL);
        this.addView(frontPage, layoutParams);
        this.addView(backPage, layoutParams);
        this.setBackgroundColor(Color.parseColor("#66ccff"));
    }
    @Override
    public void onClick(View v) {
        float centerX = this.getWidth() / 2;
        float centerY = this.getHeight() / 2;
        final Rotate3dAnimation rotation = new Rotate3dAnimation(90,0,centerX,centerY,310.0f,false);
        rotation.setDuration(500);
        rotation.setFillAfter(true);
        rotation.setInterpolator(new AccelerateInterpolator());
//        layout.startAnimation(rotation);
    }
}
