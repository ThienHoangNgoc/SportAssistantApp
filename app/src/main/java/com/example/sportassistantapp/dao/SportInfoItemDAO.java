package com.example.sportassistantapp.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.sportassistantapp.roomDBModel.SportInfoItem;

import java.util.List;

@Dao
public interface SportInfoItemDAO {

    @Insert
    public void insert(SportInfoItem... items);

    @Update
    public void update(SportInfoItem... items);

    @Delete
    public void delete(SportInfoItem item);

    @Query("SELECT * FROM sportInfoItems")
    public List<SportInfoItem> getItems();

    @Query("SELECT * FROM sportInfoItems WHERE id = :id")
    public SportInfoItem getItemById(Long id);

    @Query("SELECT * FROM sportInfoItems WHERE name = :name")
    public SportInfoItem getItemByName(String name);
}
