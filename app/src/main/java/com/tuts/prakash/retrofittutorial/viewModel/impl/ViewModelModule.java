package com.tuts.prakash.retrofittutorial.viewModel.impl;

import com.tuts.prakash.retrofittutorial.dataLayer.HomeAPI;
import com.tuts.prakash.retrofittutorial.viewModel.HomeViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;



@Module
public class ViewModelModule {
    @Provides
    @Singleton
    HomeViewModel providesHomeViewModel(HomeAPI api) {
        return new HomeViewModelImpl(api);
    }


}
