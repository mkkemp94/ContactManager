package com.anushka.androidtutz.contactmanager.di;

import android.app.Application;

import com.anushka.androidtutz.contactmanager.db.ContactAppDatabase;

import javax.inject.Singleton;

import androidx.room.Room;
import androidx.room.RoomDatabase;
import dagger.Module;
import dagger.Provides;

@Module
public class ContactAppDatabaseModule
{
    RoomDatabase.Callback callback;
    
    public ContactAppDatabaseModule(RoomDatabase.Callback callback)
    {
        this.callback = callback;
    }
    
    @Singleton
    @Provides
    ContactAppDatabase provideContactAppDatabase(Application application)
    {
        return Room.databaseBuilder(application.getApplicationContext(),
                ContactAppDatabase.class, "ContactDB"
        ).addCallback(callback).build();
    }
}
