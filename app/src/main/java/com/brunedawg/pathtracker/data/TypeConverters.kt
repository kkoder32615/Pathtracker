package com.brunedawg.pathtracker.data

import androidx.room.TypeConverter
import com.brunedawg.pathtracker.data.dataclasses.Ability
import com.brunedawg.pathtracker.data.dataclasses.Armor
import com.brunedawg.pathtracker.data.dataclasses.Feat
import com.brunedawg.pathtracker.data.dataclasses.InventoryItem
import com.brunedawg.pathtracker.data.dataclasses.KnownLanguage
import com.brunedawg.pathtracker.data.dataclasses.Skills
import com.brunedawg.pathtracker.data.dataclasses.Spell
import com.brunedawg.pathtracker.data.dataclasses.Weapon
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class AbilityListConverter {
    @TypeConverter
    fun fromString(value: String): List<Ability> = Json.decodeFromString(value)

    @TypeConverter
    fun toString(list: List<Ability>) = Json.encodeToString(list)
}

class FeatListConverter {
    @TypeConverter
    fun fromString(value: String): List<Feat> = Json.decodeFromString(value)

    @TypeConverter
    fun toString(list: List<Feat>) = Json.encodeToString(list)
}

class InventoryListConverter {
    @TypeConverter
    fun fromString(value: String): List<InventoryItem> = Json.decodeFromString(value)

    @TypeConverter
    fun toString(list: List<InventoryItem>) = Json.encodeToString(list)

}

class KnownLanguageListConverter {
    @TypeConverter
    fun fromString(value: String): List<KnownLanguage> = Json.decodeFromString(value)

    @TypeConverter
    fun toString(list: List<KnownLanguage>) = Json.encodeToString(list)
}

class SkillsListConverter {
    @TypeConverter
    fun fromString(value: String): List<Skills> = Json.decodeFromString(value)

    @TypeConverter
    fun toString(list: List<Skills>) = Json.encodeToString(list)
}

class SpellListConverter {
    @TypeConverter
    fun fromString(value: String): List<Spell> = Json.decodeFromString(value)

    @TypeConverter
    fun toString(list: List<Spell>) = Json.encodeToString(list)
}

class ArmorListConverter {
    @TypeConverter
    fun fromString(value: String): List<Armor> = Json.decodeFromString(value)

    @TypeConverter
    fun toString(list: List<Armor>) = Json.encodeToString(list)
}

class WeaponListConverter {
    @TypeConverter
    fun fromString(value: String): List<Weapon> = Json.decodeFromString(value)

    @TypeConverter
    fun toString(list: List<Weapon>) = Json.encodeToString(list)
}