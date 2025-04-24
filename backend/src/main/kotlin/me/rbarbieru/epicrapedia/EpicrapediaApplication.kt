package me.rbarbieru.epicrapedia

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EpicrapediaApplication

fun main(args: Array<String>) {
    runApplication<EpicrapediaApplication>(*args)
}
