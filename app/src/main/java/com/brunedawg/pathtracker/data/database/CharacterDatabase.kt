package com.brunedawg.pathtracker.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.brunedawg.pathtracker.data.AbilityListConverter
import com.brunedawg.pathtracker.data.ArmorListConverter
import com.brunedawg.pathtracker.data.FeatListConverter
import com.brunedawg.pathtracker.data.InventoryListConverter
import com.brunedawg.pathtracker.data.KnownLanguageListConverter
import com.brunedawg.pathtracker.data.SkillsListConverter
import com.brunedawg.pathtracker.data.SpellListConverter
import com.brunedawg.pathtracker.data.WeaponListConverter

@Database(entities = [Character::class], version = 1)
@TypeConverters(
    AbilityListConverter::class,
    FeatListConverter::class,
    InventoryListConverter::class,
    KnownLanguageListConverter::class,
    SkillsListConverter::class,
    SpellListConverter::class,
    ArmorListConverter::class,
    WeaponListConverter::class,
)
abstract class CharacterDatabase : RoomDatabase() {
    abstract fun dao(): CharacterDao
}