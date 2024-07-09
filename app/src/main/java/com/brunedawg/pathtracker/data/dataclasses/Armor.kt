package com.brunedawg.pathtracker.data.dataclasses

import com.brunedawg.pathtracker.data.enums.ArmorType
import kotlinx.serialization.Serializable

@Serializable
data class Armor(
    var name: String = "",
    var acBonus: Int = 0,
    var type: ArmorType = ArmorType.LIGHT_ARMOR,
    var checkPenalty: Int = 0,
    var spellFailure: Int = 0,
    var weight: Int = 0,
    var properties: String = "",
)