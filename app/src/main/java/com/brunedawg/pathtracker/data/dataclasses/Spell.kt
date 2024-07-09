package com.brunedawg.pathtracker.data.dataclasses

import com.brunedawg.pathtracker.data.enums.MagicSchool
import com.brunedawg.pathtracker.data.enums.SaveType

data class Spell(
    var level: Int = 0,
    var specialAbility: Boolean = false,
    var uses: Int = 0,
    var name: String = "",
    var description: String = "",
    var school: MagicSchool = MagicSchool.ABJURATION,
    var duration: String = "",
    var range: String = "",
    var saveType: SaveType = SaveType.FORTITUDE,
    var saveDC: Int = 0,
    var spellResistance: Boolean = false,
    var reference: String = "",
)