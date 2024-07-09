package com.brunedawg.pathtracker.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.brunedawg.pathtracker.data.dataclasses.Ability
import com.brunedawg.pathtracker.data.dataclasses.Armor
import com.brunedawg.pathtracker.data.dataclasses.Feat
import com.brunedawg.pathtracker.data.dataclasses.Inventory
import com.brunedawg.pathtracker.data.dataclasses.KnownLanguage
import com.brunedawg.pathtracker.data.dataclasses.Skills
import com.brunedawg.pathtracker.data.dataclasses.Spell
import com.brunedawg.pathtracker.data.dataclasses.Weapon
import com.brunedawg.pathtracker.data.enums.CharacterAlignment
import com.brunedawg.pathtracker.data.enums.CharacterGender
import com.brunedawg.pathtracker.data.enums.CharacterSize

@Entity(tableName = "character")
data class Character(
    @PrimaryKey(autoGenerate = true) val uid: Int = 0,
    @ColumnInfo(name = "characterName", defaultValue = "") var characterName: String = "",
    @ColumnInfo(name = "characterAlignment", defaultValue = "") var characterAlignment: CharacterAlignment = CharacterAlignment.NEUTRAL,
    @ColumnInfo(name = "characterLevel", defaultValue = "1") var characterLevel: Int = 1,
    @ColumnInfo(name = "characterDeity", defaultValue = "") var characterDeity: String = "",
    @ColumnInfo(name = "characterFirstRace", defaultValue = "") var characterFirstRace: String = "",
    @ColumnInfo(name = "characterSecondRace", defaultValue = "") var characterSecondRace: String = "",
    @ColumnInfo(name = "characterSize", defaultValue = "") var characterSize: CharacterSize = CharacterSize.MEDIUM,
    @ColumnInfo(name = "characterGender", defaultValue = "") var characterGender: CharacterGender = CharacterGender.FEMALE,
    @ColumnInfo(name = "characterAge", defaultValue = "1") var characterAge: Int = 1,
    @ColumnInfo(name = "characterHeightFeet", defaultValue = "1") var characterHeightFeet: Int = 1,
    @ColumnInfo(name = "characterHeightInches", defaultValue = "0") var characterHeightInches: Int = 0,
    @ColumnInfo(name = "characterWeight", defaultValue = "1") var characterWeight: Int = 1,
    @ColumnInfo(name = "characterHair", defaultValue = "") var characterHair: String = "",
    @ColumnInfo(name = "characterEyes", defaultValue = "") var characterEyes: String = "",
    @ColumnInfo(name = "characterSpeedBase", defaultValue = "0") var characterSpeedBase: Int = 0,
    @ColumnInfo(name = "characterSpeedWithArmor", defaultValue = "0") var characterSpeedWithArmor: Int = 0,
    @ColumnInfo(name = "characterHPMax", defaultValue = "1") var characterHPMax: Int = 1,
    @ColumnInfo(name = "damageResistance", defaultValue = "0") var damageResistance: Int = 0,
    @ColumnInfo(name = "characterHPCurrent", defaultValue = "1") var characterHPCurrent: Int = 1,
    @ColumnInfo(name = "characterStrength", defaultValue = "1") var characterStrength: Int = 0,
    @ColumnInfo(name = "characterDexterity", defaultValue = "1") var characterDexterity: Int = 0,
    @ColumnInfo(name = "characterConstitution", defaultValue = "1") var characterConstitution: Int = 0,
    @ColumnInfo(name = "characterIntelligence", defaultValue = "1") var characterIntelligence: Int = 0,
    @ColumnInfo(name = "characterWisdom", defaultValue = "1") var characterWisdom: Int = 0,
    @ColumnInfo(name = "characterCharisma", defaultValue = "1") var characterCharisma: Int = 0,
    @ColumnInfo(name = "characterAC", defaultValue = "1") var characterAC: Int = 0,
    @ColumnInfo(name = "characterTouchAC", defaultValue = "1") var characterTouchAC: Int = 0,
    @ColumnInfo(name = "characterFlatFootedAC", defaultValue = "1") var characterFlatFootedAC: Int = 0,
    @ColumnInfo(name = "fortitudeSave", defaultValue = "1") var fortitudeSave: Int = 0,
    @ColumnInfo(name = "reflexSave", defaultValue = "1") var reflexSave: Int = 0,
    @ColumnInfo(name = "willSave", defaultValue = "1") var willSave: Int = 0,
    @ColumnInfo(name = "baseAttackBonus", defaultValue = "0") var baseAttackBonus: Int = 0,
    @ColumnInfo(name = "spellResistance", defaultValue = "0") var spellResistance: Int = 0,
    @ColumnInfo(name = "cmb", defaultValue = "0") var cmb: Int = 0,
    @ColumnInfo(name = "cmd", defaultValue = "0") var cmd: Int = 0,
    @ColumnInfo(name = "xp", defaultValue = "0") var xp: Int = 0,
    @ColumnInfo(name = "xpToNextLevel", defaultValue = "0") var xpToNextLevel: Int = 0,
    @ColumnInfo(name = "heroPoints", defaultValue = "0") var heroPoints: Int = 0,
    @ColumnInfo(name = "weapons", defaultValue = "") var weapons: List<Weapon>,
    @ColumnInfo(name = "armor", defaultValue = "") var armor: List<Armor>,
    @ColumnInfo(name = "spells", defaultValue = "") var spells: List<Spell>,
    @ColumnInfo(name = "skills", defaultValue = "") var skills: List<Skills>,
    @ColumnInfo(name = "languages", defaultValue = "") var languages: List<KnownLanguage>,
    @ColumnInfo(name = "inventory", defaultValue = "") var inventory: Inventory? = null,
    @ColumnInfo(name = "naturalArmorBonus", defaultValue = "0") var naturalArmorBonus: Int = 0,
    @ColumnInfo(name = "deflectionModifier", defaultValue = "0") var deflectionModifier: Int = 0,
    @ColumnInfo(name = "feats", defaultValue = "") var feats: List<Feat>,
    @ColumnInfo(name = "abilities", defaultValue = "") var abilities: List<Ability>,
)