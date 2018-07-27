package com.tuts.prakash.retrofittutorial.dataLayer.impl;

import com.tuts.prakash.retrofittutorial.dataLayer.HomeAPI;
import com.tuts.prakash.retrofittutorial.service.HomeService;
import com.tuts.prakash.retrofittutorial.util.RetrofitFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;



@Module
public class DataLayerModule {

    @Provides
    @Singleton
    HomeService providesHomeService() {
        return RetrofitFactory.createService(HomeService.class);
    }

    @Provides
    @Singleton
    HomeAPI providesHomeAPI (HomeService service) {
        return new HomeAPIImpl(service);
    }

}
