package com.tuts.prakash.retrofittutorial;

import com.tuts.prakash.retrofittutorial.activity.MainActivity;



import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Randa on 3/18/2018.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(DrTipsApplication app);
    void inject(MainActivity mainActivity);
}
