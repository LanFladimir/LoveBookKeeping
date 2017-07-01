package com.fladimir.loversbookkeeping.activity.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import com.fladimir.jutils.tools.Logger.Logger;
import com.fladimir.jutils.tools.SystyemTools;
import com.fladimir.loversbookkeeping.R;
import com.fladimir.loversbookkeeping.activity.test.RecyclerViewAnim;

/**
 * SplashActivity
 */
public class SplashActivity extends AppCompatActivity {
    private Context mContext;
    private TextView splash_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //StatusBarUtil.setTransparent(SplashActivity.this);
        mContext = SplashActivity.this;
        splash_show = (TextView) findViewById(R.id.splash_show);
        String showText = getString(R.string.app_name) + "  V" + SystyemTools.getVersionName(mContext);
        splash_show.setText(showText);

        try {
            Class lovers = Class.forName("com.fladimir.loversbookkeeping.activity.we.LoversActivity");
            //Logger.e("interface",lovers.getInterfaces()[0]);
            Logger.e("super", lovers.getSuperclass().getName());
            Logger.e("superImpl", lovers.getSuperclass().getInterfaces()[0]);
            Logger.e("lovers", lovers.getClass().getName());
            Logger.e("lovers", lovers.getName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation =
                new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0f, Animation.RELATIVE_TO_SELF, 0f,
                        Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0f);
        translateAnimation.setDuration(1200);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
        alphaAnimation.setDuration(1200);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setStartOffset(300);

        splash_show.setAnimation(animationSet);

        splash_show.postDelayed(() -> {
            //check login state
            /*if (SpHelper.firstOpen(mContext))
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            else
                startActivity(new Intent(SplashActivity.this, RecyclerViewAnim.class));*/
                startActivity(new Intent(SplashActivity.this, RecyclerViewAnim.class));
            finish();
        }, 1500);
    }
}
