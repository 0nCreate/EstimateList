package com.oncreate.estimatelist.mvp;

import android.util.Log;

import com.oncreate.estimatelist.general.Const;

public abstract class BasePresenter<T extends MvpView> implements MvpPresenter<T> {

    private T view;

    @Override
    public void attachView(T mvpView) {
        Log.d(Const.LOG.PRES, "attachView");
        view = mvpView;
    }

    @Override
    public void detachView() {
        Log.d(Const.LOG.PRES, "detachView");
        view = null;
    }

    public T getView() {
        return view;
    }
}
