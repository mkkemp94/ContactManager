package com.anushka.androidtutz.contactmanager.di;

import com.anushka.androidtutz.contactmanager.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        ContactAppDatabaseModule.class,
        ApplicationModule.class
})
public interface AppComponent
{
    void inject(MainActivity mainActivity);
}
