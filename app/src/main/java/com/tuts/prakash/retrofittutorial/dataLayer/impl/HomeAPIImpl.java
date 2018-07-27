package com.tuts.prakash.retrofittutorial.dataLayer.impl;

import com.tuts.prakash.retrofittutorial.dataLayer.HomeAPI;
import com.tuts.prakash.retrofittutorial.model.RetroPhoto;
import com.tuts.prakash.retrofittutorial.service.HomeService;

import java.util.HashMap;
import java.util.List;
import rx.Observable;



class HomeAPIImpl implements HomeAPI {
    private HomeService service;

    HomeAPIImpl(HomeService service) {
        this.service = service;
    }

    @Override
    public Observable<List<RetroPhoto>> getAllPhotos() {
        return service.getAllPhotos();
    }
}
