package com.devfatani.dagger;

import android.util.Log;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class RiverModule {
    private static final String TAG = "RiverModule";

    @Singleton
    @Provides
    River provideRiver() {
        Log.i(TAG, "DevFatani provideRiver: ");
        return new River();
    }
}
