package com.oncreate.estimatelist;

import android.app.Application;

import com.oncreate.estimatelist.dagger.ApplicationComponent;
import com.oncreate.estimatelist.dagger.DaggerApplicationComponent;


public class MainApp extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder().build();
    }

    public ApplicationComponent getAppComponent() {
        return applicationComponent;
    }
}
