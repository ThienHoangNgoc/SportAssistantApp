package com.example.sportassistantapp.roomDB;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.sportassistantapp.dao.SportInfoItemDAO;
import com.example.sportassistantapp.roomDBModel.SportInfoItem;

@Database(entities = {SportInfoItem.class}, version = 2)
public abstract class SportInfoItemDatabase extends RoomDatabase {
    public abstract SportInfoItemDAO getItemDAO();

}
