package com.brunedawg.pathtracker.data.dataclasses

import kotlinx.serialization.Serializable

@Serializable
data class Ability(
    var name: String = "",
    var effects: String = "",
)