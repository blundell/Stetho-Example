package com.blundell.stethoexample;

import android.app.Application;

public class ExampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        new OptionalDependencies(this).initialize();
    }
}
