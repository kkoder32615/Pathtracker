package com.brunedawg.pathtracker.data

import com.brunedawg.pathtracker.data.enums.CharacterSize
import kotlin.math.floor

fun calculateAbilityModifier(abilityScore: Int) = floor((abilityScore - 10) / 2.0).toInt()

fun calculateInitiative(dex: Int, misc: Int): Int = calculateAbilityModifier(dex) + misc

fun calculateArmorClass(
    armorBonus: Int = 0,
    shieldBonus: Int = 0,
    dex: Int = 0,
    size: CharacterSize = CharacterSize.MEDIUM,
    naturalArmor: Int = 0,
    deflectionModifier: Int = 0,
    misc: Int = 0,
) = (10 + armorBonus + shieldBonus + calculateAbilityModifier(dex) + calculateSizeModifier(size) +
        naturalArmor + deflectionModifier + misc)

fun calculateSizeModifier(size: CharacterSize = CharacterSize.MEDIUM) = when (size) {
    CharacterSize.FINE -> 8
    CharacterSize.DIMINUTIVE -> 4
    CharacterSize.TINY -> 2
    CharacterSize.SMALL -> 1
    CharacterSize.MEDIUM -> 0
    CharacterSize.LARGE -> -1
    CharacterSize.HUGE -> -2
    CharacterSize.GARGANTUAN -> -4
    CharacterSize.COLOSSAL -> -8
}

fun calculateTouchAC(
    dex: Int = 0,
    size: CharacterSize = CharacterSize.MEDIUM,
    deflectionModifier: Int = 0,
    misc: Int = 0,
) = calculateAbilityModifier(dex) + calculateSizeModifier(size) + deflectionModifier + misc

fun calculateFlatFootedAC(
    armorBonus: Int = 0,
    shieldBonus: Int = 0,
    size: CharacterSize = CharacterSize.MEDIUM,
    naturalArmor: Int = 0,
    deflectionModifier: Int = 0,
    misc: Int = 0,
) = (10 + armorBonus + shieldBonus + calculateSizeModifier(size) + naturalArmor
        + deflectionModifier + misc)

fun calculateFortitudeSave(base: Int = 0, con: Int = 0, misc: Int = 0) =
    base + calculateAbilityModifier(con) + misc

fun calculateReflexSave(base: Int = 0, dex: Int = 0, misc: Int = 0) =
    base + calculateAbilityModifier(dex) + misc

fun calculateWillSave(base: Int = 0, wis: Int = 0, misc: Int = 0) =
    base + calculateAbilityModifier(wis) + misc

fun calculateCMB(
    baseAttackBonus: Int = 0,
    str: Int = 0,
    size: CharacterSize = CharacterSize.MEDIUM,
    misc: Int = 0
) = baseAttackBonus + calculateAbilityModifier(str) + calculateSizeModifier(size) + misc

fun calculateCMD(
    baseAttackBonus: Int = 0,
    str: Int = 0,
    dex: Int = 0,
    size: CharacterSize = CharacterSize.MEDIUM,
    misc: Int = 0
) = 10 + baseAttackBonus + calculateAbilityModifier(str) + calculateAbilityModifier(dex) +
        calculateSizeModifier(size) + misc
