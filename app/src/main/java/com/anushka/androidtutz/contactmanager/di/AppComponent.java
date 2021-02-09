package com.anushka.androidtutz.contactmanager.di;

import com.anushka.androidtutz.contactmanager.MainActivity;

import dagger.Component;

@Component(modules = ContactAppDatabaseModule.class)
public interface AppComponent
{
    void inject(MainActivity mainActivity);
}
