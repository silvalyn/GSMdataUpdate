package com.example.gsmdata;

import android.content.Intent;
import android.os.Bundle;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class FirstFragment extends AppCompatActivity{
    private  static final  String TAG ="FirstFragment";


    private TextView mBinlist;

    private FirebaseAuth mAuth;
    private  Button Bin1;
    private  Button Signout;
    private TextView mBinList;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Toolbar toolbar = findViewById(R.id.toolbar);
//        setProgressBar(R.id.progressBar);

        setSupportActionBar(toolbar);


        mBinlist = findViewById(R.id.textview_first);
        Bin1=(Button)findViewById(R.id.button_first);
        Signout=(Button)findViewById(R.id.signout);

        findViewById(R.id.button_first);
        mAuth = FirebaseAuth.getInstance();

        Bin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(FirstFragment.this, Home .class);
                startActivity(intent);
            }
        });

        Signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                Intent intent =new Intent(FirstFragment.this, MainActivity .class);
                startActivity(intent);
            }
        });
    }
}
