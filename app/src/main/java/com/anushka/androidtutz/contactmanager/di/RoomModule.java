package com.anushka.androidtutz.contactmanager.di;

import android.app.Application;

import com.anushka.androidtutz.contactmanager.db.ContactAppDatabase;

import javax.inject.Singleton;

import androidx.room.Room;
import dagger.Module;
import dagger.Provides;

@Module
public class RoomModule
{
    @Singleton
    @Provides
    ContactAppDatabase provideContactAppDatabase(Application application)
    {
        return Room.databaseBuilder(application.getApplicationContext(),
                ContactAppDatabase.class, "ContactDB"
        ).build();
    }
}
