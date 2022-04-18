package game.functionGame

import game.iO.TextInputs

class Game {
    val grid = Grid()
    val ti = TextInputs()

    fun startGame(){
        val players = ti.getAmountPlayers()
        var playerOnMove = 0
        grid.createGrid()
        var gaming = true
        while (gaming){

        }
    }
}