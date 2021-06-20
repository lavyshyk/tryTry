package com.lavyshyk.nyethack



class Game

fun main() {


    val player = Player("kar")
    player.castFireball(5)
    kotlin.io.println(player.name)


    // Aura
    val auraColor = player.auraColor(player.isBlessed)

    // player status

    printPlayerStatus(player,auraColor)

    //Aura
    player.auraColor(player.isBlessed)

}

private fun printPlayerStatus(
    player: Player,
    auraColor: String
) {
    println(
        "(Aura: $auraColor " +
                "(lessed: ${if (player.isBlessed) "YES" else "NO"})"
    )
    println("${player.name} ${player.formatHealthStatus()}")
}
