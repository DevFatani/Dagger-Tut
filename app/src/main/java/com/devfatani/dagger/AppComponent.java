package com.devfatani.dagger;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = RiverModule.class)
interface AppComponent {

    CoffeeComponent.Builder getCoffeeComponentBuilder();
}
