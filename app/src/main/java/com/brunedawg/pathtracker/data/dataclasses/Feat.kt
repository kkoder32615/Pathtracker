package com.brunedawg.pathtracker.data.dataclasses

import kotlinx.serialization.Serializable

@Serializable
data class Feat(
    var name: String = "",
    var effects: String = "",
)