package me.rbarbieru.epicrapedia.entities

import jakarta.persistence.*
import java.time.Instant

@Entity
@Table(name = "battles")
data class BattleEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = false)
    val title: String,

    @Column(nullable = false)
    val lyrics: String,

    @Column(name = "uploaded_at", nullable = false)
    val uploadedAt: Instant,

    @Column(name = "created_at", nullable = false, updatable = false)
    val createdAt: Instant = Instant.now(),

    @Column(name = "updated_at")
    val updatedAt: Instant? = null
)
