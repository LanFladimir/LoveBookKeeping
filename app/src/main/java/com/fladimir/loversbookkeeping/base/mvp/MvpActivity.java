package com.fladimir.loversbookkeeping.base.mvp;

import android.os.Bundle;

import com.fladimir.loversbookkeeping.base.activity.BaseActivity;

/**
 * Created by NingJiang on 2017/6/1.
 * Class Note:
 */

public abstract class MvpActivity <P extends BasePresenter> extends BaseActivity {
    protected P mvpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mvpPresenter = createPresenter();
        super.onCreate(savedInstanceState);
    }

    protected abstract P createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mvpPresenter != null) {
            mvpPresenter.detachView();
        }
    }

    public void showLoading() {
        showProgressDialog();
    }

    public void hideLoading() {
        dismissProgressDialog();
    }
}