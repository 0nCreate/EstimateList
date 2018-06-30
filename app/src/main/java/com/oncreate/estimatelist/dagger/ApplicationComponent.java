package com.oncreate.estimatelist.dagger;

import com.oncreate.estimatelist.view.MainActivity;

import dagger.Component;

@Component(modules = {ListModule.class})
public interface ApplicationComponent {

    void inject(MainActivity activity);

}
