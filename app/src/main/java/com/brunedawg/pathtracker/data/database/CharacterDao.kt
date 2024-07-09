package com.brunedawg.pathtracker.data.database

import androidx.room.Dao
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface CharacterDao {
    @Query("SELECT * FROM character")
    fun get(): Character

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(): Character
}