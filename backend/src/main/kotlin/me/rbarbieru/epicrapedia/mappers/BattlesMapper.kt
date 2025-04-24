package me.rbarbieru.epicrapedia.mappers

import me.rbarbieru.epicrapedia.dtos.BattleDto
import me.rbarbieru.epicrapedia.entities.BattleEntity
import org.springframework.stereotype.Component

@Component
class BattlesMapper {

    fun entityToDto(entity: BattleEntity): BattleDto {
        return BattleDto(entity.title, entity.lyrics, entity.uploadedAt)
    }

    fun entitiesToDtos(entities: List<BattleEntity>): List<BattleDto> {
        return entities.map { entityToDto(it) }
    }

}