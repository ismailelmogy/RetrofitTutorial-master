package com.tuts.prakash.retrofittutorial.dataLayer;

import com.tuts.prakash.retrofittutorial.model.RetroPhoto;

import java.util.HashMap;
import java.util.List;

import rx.Observable;

/**
 * Created by Randa on 3/18/2018.
 */

public interface HomeAPI {
    Observable<List<RetroPhoto>> getAllPhotos();

}
