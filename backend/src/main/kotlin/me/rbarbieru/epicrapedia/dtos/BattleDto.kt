package me.rbarbieru.epicrapedia.dtos

import java.time.Instant

data class BattleDto(
    val title: String,
    val lyrics: String,
    val uploadedAt: Instant
)
