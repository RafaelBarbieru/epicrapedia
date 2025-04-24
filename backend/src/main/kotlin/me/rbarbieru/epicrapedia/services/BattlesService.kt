package me.rbarbieru.epicrapedia.services

import me.rbarbieru.epicrapedia.dtos.BattleDto
import me.rbarbieru.epicrapedia.entities.BattleEntity
import me.rbarbieru.epicrapedia.mappers.BattlesMapper
import me.rbarbieru.epicrapedia.repositories.BattlesRepository
import org.springframework.stereotype.Service

@Service
class BattlesService(
    val battlesRepository: BattlesRepository,
    val battlesMapper: BattlesMapper
) {

    fun getAllBattles(): List<BattleDto> {
        val battleEntities: List<BattleEntity> = battlesRepository.findAll()
        return battlesMapper.entitiesToDtos(battleEntities)
    }

}