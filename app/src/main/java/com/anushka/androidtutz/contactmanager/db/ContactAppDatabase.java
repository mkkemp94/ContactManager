package com.anushka.androidtutz.contactmanager.db;

import com.anushka.androidtutz.contactmanager.db.entity.Contact;
import com.anushka.androidtutz.contactmanager.db.entity.ContactDao;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = { Contact.class }, version = 1)
public abstract class ContactAppDatabase extends RoomDatabase
{
    public abstract ContactDao getContactDao();
}
