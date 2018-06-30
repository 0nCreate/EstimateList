package com.oncreate.estimatelist.presenters;

import android.util.Log;

import com.oncreate.estimatelist.general.Const;
import com.oncreate.estimatelist.mvp.BasePresenter;
import com.oncreate.estimatelist.mvp.ListContract;

public class ListPresenter extends BasePresenter<ListContract.ListView> implements ListContract.Presenter {

    @Override
    public void start(int amounts, int threads) {
        Log.d(Const.LOG.PRES, "press start");
        getView().estimateComplete();
    }

    @Override
    public void stop() {
        Log.d(Const.LOG.PRES, "press stop");
    }
}
