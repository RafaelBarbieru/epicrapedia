package me.rbarbieru.epicrapedia.controllers

import me.rbarbieru.epicrapedia.dtos.BattleDto
import me.rbarbieru.epicrapedia.services.BattlesService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BattlesController(
    val battlesService: BattlesService
) {

    @GetMapping("/battles")
    fun getAllBattles(): List<BattleDto> {
        System.out.println("Hello world")
        return battlesService.getAllBattles()
    }

}