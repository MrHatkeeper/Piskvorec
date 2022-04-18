package game.logicalPart

import game.iO.TextInputs
import game.iO.TextOutputs

class Game {
    val grid = Grid()
    val ti = TextInputs()
    val to = TextOutputs()
    val p = Player()
    fun startGame() {
        val players = ti.getAmountPlayers()
        var playerOnMove = 1
        grid.createGrid()
        var gaming = true
        while (gaming) {
            to.showGrid(grid.grid)
            if (playerOnMove == 1) {
                grid.grid = p.makeMove(grid.grid, playerOnMove)
            }
            else{

            }

            if(isWinning()){
                to.winningPlayer(playerOnMove)
                gaming = false
            }

            if(playerOnMove == players){
                playerOnMove = 1
            }
            else{
                playerOnMove++
            }


        }
    }

    private fun isWinning(): Boolean{
        return false
    }
}