package com.tuts.prakash.retrofittutorial;


import android.support.multidex.MultiDexApplication;



public class DrTipsApplication extends MultiDexApplication {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        component.inject(this);
    }

    public AppComponent getComponent() {
        return this.component;
    }
}
