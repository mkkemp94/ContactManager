package com.anushka.androidtutz.contactmanager.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule
{
    private Application application;
    
    public ApplicationModule(Application application)
    {
        this.application = application;
    }
    
    @Singleton
    @Provides
    Application provideApplication()
    {
        return application;
    }
}
