package com.devfatani.dagger;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Farm {
    private static final String TAG = "Farm";

    @Inject
    public Farm() {
        Log.i(TAG, "DevFatani Farm: ");
    }

    public String getBeans() {
        return "Beans";
    }
}
