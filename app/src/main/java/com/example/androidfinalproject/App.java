package com.example.androidfinalproject;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MyImageUtils.initHelper(this);
    }
}
