package com.brunedawg.pathtracker.data.dataclasses

import kotlinx.serialization.Serializable

@Serializable
data class InventoryItem(
    var name: String = "",
    var description: String = "",
    var quantity: Int = 0,
    var value: String = "",
)
