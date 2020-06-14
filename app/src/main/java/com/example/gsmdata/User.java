package com.example.gsmdata;


import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class User {
    private FirebaseDatabase mDatabase;
    private DatabaseReference mReference;
    private List<ReadData> books = new ArrayList<>();

    public  interface  DataStatus{
        void DataIsLoaded(List<ReadData> books, List<String>keys);
        void DataInserted();
        void DataIsUploaded();
        void DataIsDeleted();
    }
    public User() {
        mDatabase=FirebaseDatabase.getInstance();
        mReference=mDatabase.getReference("BinData");
    }
    public void readData(final DataStatus dataStatus){
        mReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                books.clear();
                List<String> keys=new ArrayList<>();
                for(DataSnapshot keyNode : dataSnapshot.getChildren()){
                    keys.add(keyNode.getKey());
                    ReadData book=keyNode.getValue(ReadData.class);
                    books.add(book);
                }
                dataStatus.DataIsLoaded(books,keys);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}