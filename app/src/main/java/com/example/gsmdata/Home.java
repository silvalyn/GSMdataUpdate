package com.example.gsmdata;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Home extends AppCompatActivity{

    private RecyclerView mRecyclerView;
    protected void  onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_second);
        mRecyclerView=(RecyclerView) findViewById(R.id.recycler_books);
        new User().readData(new User.DataStatus() {
            @Override
            public void DataIsLoaded(List<ReadData> books, List<String> keys) {
                findViewById(R.id.progressbar).setVisibility(View.GONE);
                new RecyclerView_Cofig().setConfig(mRecyclerView,Home.this,books,keys);
            }

            @Override
            public void DataInserted() {

            }

            @Override
            public void DataIsUploaded() {

            }

            @Override
            public void DataIsDeleted() {

            }
        });
    }

}