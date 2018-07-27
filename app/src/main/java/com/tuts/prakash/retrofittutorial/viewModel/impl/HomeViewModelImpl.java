package com.tuts.prakash.retrofittutorial.viewModel.impl;

import com.tuts.prakash.retrofittutorial.dataLayer.HomeAPI;
import com.tuts.prakash.retrofittutorial.model.RetroPhoto;
import com.tuts.prakash.retrofittutorial.viewModel.HomeViewModel;

import java.util.HashMap;
import java.util.List;


import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;



class HomeViewModelImpl  implements HomeViewModel {
    private HomeAPI api;

    HomeViewModelImpl(HomeAPI api) {
        this.api = api;
    }

    @Override
    public Observable<List<RetroPhoto>> getAllPhotos() {
        return api.getAllPhotos().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());

    }
}
