package com.fladimir.loversbookkeeping.activity.we;

import android.os.Bundle;
import android.view.View;

import com.fladimir.loversbookkeeping.R;
import com.fladimir.loversbookkeeping.base.activity.BaseActivity;

import butterknife.OnTouch;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by NingJiang on 2017/5/27.
 * Class Note:个人空间
 */

public class LoversActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lovers_activity);
        initToolBar("个人空间");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onClick(View v) {

    }
}
