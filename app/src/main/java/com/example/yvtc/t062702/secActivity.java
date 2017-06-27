package com.example.yvtc.t062702;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class secActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        Intent it = getIntent();
        int a = it.getIntExtra("va", 0);
        int b = it.getIntExtra("vb", 0);
        TextView tv = (TextView)


    }
}
