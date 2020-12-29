package com.anushka.androidtutz.contactmanager.db.entity;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface ContactDao
{
    // Primary key is of type long
    @Insert
    public long addContact(Contact contact);
    
    @Update
    public void updateContact(Contact contact);
    
    @Update
    public void deleteContact(Contact contact);
    
    @Query("SELECT * FROM contacts")
    public List<Contact> getContacts(Contact contact);
    
    @Query("SELECT * FROM contacts WHERE contact_id == :contactId")
    public Contact getContacts(long contactId);
}
