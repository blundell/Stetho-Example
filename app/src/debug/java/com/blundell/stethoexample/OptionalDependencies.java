package com.blundell.stethoexample;

import android.content.Context;

import com.facebook.stetho.Stetho;

class OptionalDependencies {
    private Context context;

    public OptionalDependencies(Context context) {
        this.context = context;
    }

    public void initialize() {
        Stetho.initializeWithDefaults(context);
    }
}
