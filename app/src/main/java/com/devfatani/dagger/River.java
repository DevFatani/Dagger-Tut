package com.devfatani.dagger;

import android.util.Log;

import javax.inject.Inject;

public class River {
    private static final String TAG = "River";

    public River() {
        Log.i(TAG, "DevFatani River: ");
    }

    public String getWater() {
        return "water";
    }
}
