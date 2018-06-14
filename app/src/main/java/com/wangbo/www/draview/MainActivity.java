package com.wangbo.www.draview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wangbo.www.draviewlib.view.CustomDrawView;

public class MainActivity extends AppCompatActivity {
    private CustomDrawView test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test=this.findViewById(R.id.test);
    }
}
