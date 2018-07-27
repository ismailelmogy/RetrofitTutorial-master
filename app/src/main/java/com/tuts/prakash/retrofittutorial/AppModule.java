package com.tuts.prakash.retrofittutorial;

import android.app.Application;
import android.content.Context;

import com.tuts.prakash.retrofittutorial.dataLayer.impl.DataLayerModule;
import com.tuts.prakash.retrofittutorial.util.PreferenceHelper;
import com.tuts.prakash.retrofittutorial.viewModel.impl.ViewModelModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;



@Module(includes = {DataLayerModule.class, ViewModelModule.class})
public class AppModule {
    private Application app;

    AppModule(Application app) {
        this.app = app;
    }

    @Singleton
    @Provides
    Context providesContext () {
        return app;
    }

    @Singleton
    @Provides
    PreferenceHelper providesPreferenceHelper(Context context) {
        return  new PreferenceHelper(context);
    }

//    @Singleton
//    @Provides
//    ImageLoader providesImageLoader(Context context){
//        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
//                .memoryCacheExtraOptions(480, 800)
//                .diskCacheExtraOptions(480, 800, null)
//                .threadPoolSize(3)
//                .threadPriority(Thread.NORM_PRIORITY - 2)
//                .tasksProcessingOrder(QueueProcessingType.FIFO)
//                .denyCacheImageMultipleSizesInMemory()
//                .memoryCache(new LruMemoryCache(2 * 1024 * 1024))
//                .memoryCacheSize(2 * 1024 * 1024)
//                .memoryCacheSizePercentage(25)
//                .diskCacheSize(50 * 1024 * 1024)
//                .diskCacheFileCount(100)
//                .diskCacheFileNameGenerator(new HashCodeFileNameGenerator())
//                .imageDownloader(new BaseImageDownloader(context))
//                .defaultDisplayImageOptions(DisplayImageOptions.createSimple())
//                .writeDebugLogs()
//                .build();
//        ImageLoader.getInstance().init(config);
//        return ImageLoader.getInstance();
//    }
}
