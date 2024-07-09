package com.brunedawg.pathtracker.data.dataclasses

import com.brunedawg.pathtracker.data.enums.DamageType
import kotlinx.serialization.Serializable

@Serializable
data class Weapon(
    var name: String = "",
    var attackBonus: Int = 0,
    var criticalModifier: Int = 0,
    var damageType: DamageType = DamageType.BLUDGEONING,
    var range: Int = 0,
    var ammunition: Int = 0,
    var damage: String = "",
    var description: String = "",
)