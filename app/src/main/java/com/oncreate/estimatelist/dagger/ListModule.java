package com.oncreate.estimatelist.dagger;

import com.oncreate.estimatelist.presenters.ListPresenter;

import dagger.Module;
import dagger.Provides;

@Module
class ListModule {

    @Provides
    ListPresenter provideListPresenter(){
        return new ListPresenter();
    }

}
