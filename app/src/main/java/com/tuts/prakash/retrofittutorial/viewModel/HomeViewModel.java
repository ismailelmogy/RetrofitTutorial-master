package com.tuts.prakash.retrofittutorial.viewModel;

import com.tuts.prakash.retrofittutorial.model.RetroPhoto;

import java.util.HashMap;
import java.util.List;

import rx.Observable;



public interface HomeViewModel {
    Observable<List<RetroPhoto>> getAllPhotos();

}
