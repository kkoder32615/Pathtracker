package com.brunedawg.pathtracker.data.dataclasses

import com.brunedawg.pathtracker.data.enums.BaseStat
import com.brunedawg.pathtracker.data.enums.Skill
import kotlinx.serialization.Serializable

@Serializable
data class Skills(
    var name: Skill = Skill.ACROBATICS,
    var total: Int = 0,
    var baseStat: BaseStat = BaseStat.STR,
    var abilityModifier: Int = 0,
    var ranks: Int = 0,
    var miscModifier: Int = 0,
    var isClassSkill: Boolean = false,
    var isTrainedSkill: Boolean = false,
)
