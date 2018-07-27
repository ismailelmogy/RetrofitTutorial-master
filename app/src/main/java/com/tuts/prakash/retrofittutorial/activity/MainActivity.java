package com.tuts.prakash.retrofittutorial.activity;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import com.tuts.prakash.retrofittutorial.DrTipsApplication;
import com.tuts.prakash.retrofittutorial.R;
import com.tuts.prakash.retrofittutorial.adapter.CustomAdapter;
import com.tuts.prakash.retrofittutorial.model.RetroPhoto;
import com.tuts.prakash.retrofittutorial.viewModel.HomeViewModel;
import java.util.List;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private CustomAdapter adapter;
    private RecyclerView recyclerView;
    ProgressDialog progressDoalog;

    @Inject
    HomeViewModel mHomeViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((DrTipsApplication) getApplication()).getComponent().inject(this);

        progressDoalog = new ProgressDialog(MainActivity.this);
        progressDoalog.setMessage("Loading....");
        progressDoalog.show();
        mHomeViewModel.getAllPhotos().subscribe(
                pList -> {
                    progressDoalog.dismiss();
                    generateDataList(pList);
                },
                (Throwable throwable) -> {
                    progressDoalog.dismiss();
                    Toast.makeText(MainActivity.this, "Something went wrong...Please try later!",
                            Toast.LENGTH_SHORT).show();
                        });
    }

    /*Method to generate List of data using RecyclerView with custom adapter*/
    private void generateDataList(List<RetroPhoto> photoList) {
        recyclerView = findViewById(R.id.customRecyclerView);
        adapter = new CustomAdapter(this,photoList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

}
