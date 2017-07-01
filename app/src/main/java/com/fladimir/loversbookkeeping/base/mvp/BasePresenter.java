package com.fladimir.loversbookkeeping.base.mvp;

/**
 * Created by NingJiang on 2017/6/1.
 * Class Note:
 */

public class BasePresenter<V> {
    public V mvpView;

    public void attachView(V mvpView) {
        this.mvpView = mvpView;
    }


    public void detachView() {
        this.mvpView = null;
    }

}