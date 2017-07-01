package com.fladimir.loversbookkeeping.base.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.fladimir.loversbookkeeping.R;
import com.jaeger.library.StatusBarUtil;

/**
 * Created by NingJiang on 2017/5/26.
 * Class Note:
 */

public abstract class ToolBarBaseActivity extends AppCompatActivity {
    public Context mContext;
    public Toolbar toolbar;
    public TextView toolbar_midtitle;
    FrameLayout viewContent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_toolbar);
        mContext = ToolBarBaseActivity.this;
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar_midtitle = (TextView) findViewById(R.id.toolbar_midtitle);
        viewContent = (FrameLayout) findViewById(R.id.viewContent);

        //init Toolbar
        //setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_back);
        toolbar.setTitleTextAppearance(mContext, R.style.toolbartext);
        //getSupportActionBar().setDisplayShowTitleEnabled(true);

        //add content to framelayout
        LayoutInflater.from(ToolBarBaseActivity.this).inflate(getContentView(), viewContent);

        init(savedInstanceState);
        StatusBarUtil.setColor(ToolBarBaseActivity.this,
                ContextCompat.getColor(mContext, R.color.colorPrimaryDark));
    }

    protected abstract int getContentView();

    protected abstract void init(Bundle savedInstanceState);

    /**
     * init Toolbar
     *
     * @param listener
     * @param title
     */
    protected void initToolbar(@Nullable View.OnClickListener listener, String title) {
        //toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setTitleTextAppearance(mContext, R.style.toolbartext);
        toolbar.setNavigationIcon(R.drawable.ic_back);
        /*if (listener == null)
            toolbar.setNavigationOnClickListener(view -> finish());
        else*/
        toolbar.setNavigationOnClickListener(listener);
    }

    /**
     * NevigationIcon
     *
     * @param icon
     */
    protected void setNevigationIcon(int icon) {
        toolbar.setNavigationIcon(icon);
    }

}
