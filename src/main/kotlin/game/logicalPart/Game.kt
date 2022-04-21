package game.logicalPart

import game.iO.TextInputs
import game.iO.TextOutputs

class Game {
    val grid = Grid()
    val ti = TextInputs()
    val to = TextOutputs()
    val p = Player()
    val ai = Ai()
    fun startGame() {
        var lastMove = IntArray(2)
        val players = ti.getAmountPlayers()
        val ais = Array(players-1){ai}
        var playerOnMove = 1
        grid.createGrid()
        var gaming = true
        while (gaming) {
            to.showGrid(grid.grid)
            if (playerOnMove == 1) {
                grid.grid = p.makeMove(grid.grid, playerOnMove)
                lastMove = p.lastMove
            }
            else{
                //grid.grid = ais[playerOnMove].makeMove(grid.grid, playerOnMove)
                //lastMove = ais[playerOnMove].lastMove
            }

            if(isWinning(grid.grid, playerOnMove, lastMove, 3)){
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

    private fun isWinning(grid: Array<IntArray>, symbol: Int, lastMove: IntArray, winCondition: Int): Boolean{
        var inRow = 0
        for(i in grid[lastMove[0]].size-winCondition..grid[lastMove[0]].size+winCondition){
            if(grid[lastMove[0]][i] == symbol){
                inRow++
                if(inRow == winCondition){
                    return true
                }
            }
            else{
                break
            }
        }
        for(i in grid[lastMove[1]].size-winCondition..grid[lastMove[1]].size+winCondition){
            if(grid[lastMove[i]][1] == symbol){
                inRow++
                if(inRow == winCondition){
                    return true
                }
            }
            else{
                break
            }
        }
        for(i in grid[lastMove[0]].size-winCondition..grid[lastMove[0]].size+winCondition){
            if(grid[lastMove[i]][i] == symbol){
                inRow++
                if(inRow == winCondition){
                    return true
                }
            }
            else{
                break
            }
        }

    }
}