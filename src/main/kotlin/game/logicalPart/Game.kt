package game.logicalPart

import game.iO.TextInputs
import game.iO.TextOutputs

class Game {
    private val grid = Grid()
    private val ti = TextInputs()
    private val to = TextOutputs()
    private val p = Player()
    private val ai = Ai()
    private val wc = WinningConditions()
    fun startGame() {
        var lastMove = IntArray(2)
        val players = ti.getAmountPlayers()
        val ais = Array(players - 1) { ai }
        var playerOnMove = 1
        grid.createGrid()
        var gaming = true
        while (gaming) {
            to.showGrid(grid.grid)
            if (playerOnMove == 1) {
                grid.grid = p.makeMove(grid.grid, playerOnMove)
                lastMove = p.lastMove
            } else {
                grid.grid = ais[playerOnMove].makeMove(grid.grid, playerOnMove, lastMove)
                lastMove = ais[playerOnMove].lastMove
            }

            if (wc.isWinning(grid.grid, playerOnMove, 5)) {
                to.winningPlayer(playerOnMove)
                gaming = false
            }

            if (playerOnMove == players) {
                playerOnMove = 1
            } else {
                playerOnMove++
            }
        }
    }
}