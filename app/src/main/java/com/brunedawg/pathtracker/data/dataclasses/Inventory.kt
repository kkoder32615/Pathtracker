package com.brunedawg.pathtracker.data.dataclasses

data class Inventory(
    var inventoryItems: List<InventoryItem>,
    var copper: Int = 0,
    var silver: Int = 0,
    var gold: Int = 0,
    var platinum: Int = 0,
)
