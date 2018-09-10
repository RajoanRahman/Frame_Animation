package com.magadistudio.shoppinglistadvanced.frameanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private AnimationDrawable batAnimation;
    private ImageView batImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batImage = (ImageView) findViewById(R.id.batId);
        //Uncomment this for FrameAnimation to work
       // batImage.setBackgroundResource(R.drawable.bat_anim);
        //batAnimation = (AnimationDrawable) batImage.getBackground();


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //Uncomment this for FrameAnimation to work
        //batAnimation.start();
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Animation startAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadein_animation);
                batImage.startAnimation(startAnimation);

                //stop the animation
                //Uncomment this for FrameAnimation to work
               // batAnimation.stop();

            }
        }, 50); //chance to 50 for fadeAnimation
        return super.onTouchEvent(event);
    }
}
