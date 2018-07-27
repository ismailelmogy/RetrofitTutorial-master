package com.tuts.prakash.retrofittutorial.service;

import android.content.ClipData;

import com.tuts.prakash.retrofittutorial.model.RetroPhoto;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;



public interface HomeService {
    @GET("/photos")
    Observable<List<RetroPhoto>> getAllPhotos();


}
