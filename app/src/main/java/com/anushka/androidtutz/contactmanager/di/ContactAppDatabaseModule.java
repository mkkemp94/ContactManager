package com.anushka.androidtutz.contactmanager.di;

import android.app.Application;

import com.anushka.androidtutz.contactmanager.db.ContactAppDatabase;

import androidx.room.Room;
import androidx.room.RoomDatabase;
import dagger.Module;
import dagger.Provides;

@Module
public class ContactAppDatabaseModule
{
    Application application;
    RoomDatabase.Callback callback;
    
    public ContactAppDatabaseModule(Application application,
                                    RoomDatabase.Callback callback)
    {
        this.application = application;
        this.callback = callback;
    }
    
    @Provides
    ContactAppDatabase provideContactAppDatabase()
    {
        return Room.databaseBuilder(application.getApplicationContext(),
                ContactAppDatabase.class, "ContactDB"
        ).addCallback(callback).build();
    }
}
