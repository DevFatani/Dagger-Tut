package com.devfatani.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject
    Coffee coffee, coffee2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppComponent component = ((MainApplication) getApplication()).getAppComponent();

        CoffeeComponent coffeeComponent = component.getCoffeeComponentBuilder().milk(4).sugar(5).build();
        coffeeComponent.inject(this);

        String print = String.format("DevFatani onCreate:\ncoffee 1: %s\ncoffee 2: %s\nriver for coffee 1: %s\nriver for coffee 2: %s", coffee, coffee2, coffee.river, coffee2.river);

        Log.i(TAG, print);

    }
}