package com.fladimir.loversbookkeeping.activity.login;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.fladimir.loversbookkeeping.R;
import com.fladimir.loversbookkeeping.adapter.TabLayoutAdapter;
import com.fladimir.loversbookkeeping.util.BlurTransformation;
import com.r0adkll.slidr.Slidr;


/**
 * Login Activity
 */
public class LoginActivity extends FragmentActivity {

    private TabLayout login_tab;
    private ViewPager login_vp;
    private ImageView login_bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        login_bg = (ImageView) findViewById(R.id.login_bg);
        Glide.with(LoginActivity.this)
                .load(R.drawable.bg_run)
                .crossFade(1000)
                .bitmapTransform(new BlurTransformation(LoginActivity.this))
                .into(login_bg);

        login_tab = (TabLayout) findViewById(R.id.login_tab);
        login_vp = (ViewPager) findViewById(R.id.login_vp);

        String[] mTabs = {getString(R.string.signin), getString(R.string.signup)};
        Fragment[] mFragments = {new Login_SigninFragment(), new Login_SignupFragment()};

        login_vp.setAdapter(new TabLayoutAdapter(getSupportFragmentManager(), mTabs, mFragments));
        login_tab.setupWithViewPager(login_vp);
    }


    public void hideInput() {
        View view = getCurrentFocus();
        if (view != null) {
            ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).
                    hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }
}
