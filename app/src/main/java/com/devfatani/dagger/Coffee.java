package com.devfatani.dagger;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

@ActivityScope
public class Coffee {
    private static final String TAG = "Coffee";

    @Inject
    Farm farm;

    River river;

    int sugar;

    int milk;

    @Inject
    public Coffee(River river, @Sugar int sugar, @Milk int milk) {
        this.river = river;
        this.sugar = sugar;
        this.milk = milk;
    }

    @Inject
    public void connectElectricity() {
        Log.i(TAG, "DevFatani connectElectricity: connect....");
    }

    public String getCoffeeCup() {
        return String.format("%s + %s + sugar: %d + milk: %d", farm.getBeans(), river.getWater(), sugar, milk);
    }
}
