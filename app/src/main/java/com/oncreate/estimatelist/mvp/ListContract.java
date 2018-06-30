package com.oncreate.estimatelist.mvp;



import com.oncreate.estimatelist.objects.Cell;

import java.util.List;

public interface ListContract {

    interface ListView extends MvpView {
        void dataIsAvailable(List<Cell> list);
        void estimateIsNotComplete();
        void estimateComplete();
    }

    interface Presenter extends MvpPresenter<ListView> {
        void start(int amounts, int threads);
        void stop();
    }

}
