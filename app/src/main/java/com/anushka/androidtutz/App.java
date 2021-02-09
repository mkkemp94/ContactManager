package com.anushka.androidtutz;

import android.app.Application;

import com.anushka.androidtutz.contactmanager.di.AppComponent;
import com.anushka.androidtutz.contactmanager.di.ApplicationModule;
import com.anushka.androidtutz.contactmanager.di.DaggerAppComponent;

public class App extends Application
{
    private static App app;
    private AppComponent appComponent;
    
    @Override
    public void onCreate()
    {
        super.onCreate();
    
        app = this;
        appComponent = DaggerAppComponent.builder()
                .applicationModule(new ApplicationModule(app))
                .build();
    }
    
    public static App getApp()
    {
        return app;
    }
    
    public AppComponent getAppComponent()
    {
        return appComponent;
    }
}
