package me.rbarbieru.epicrapedia.repositories

import me.rbarbieru.epicrapedia.entities.BattleEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BattlesRepository : CrudRepository<BattleEntity, Long> {
    override fun findAll(): List<BattleEntity>
}