package game.logicalPart

import game.iO.TextInputs

class Player {
    var lastMove = IntArray(2)
    private val ti = TextInputs()
    fun makeMove(grid: Array<IntArray>, symbol: Int): Array<IntArray>{
        val input = ti.getPlayerInput()
        lastMove = input
        return if(grid[input[0]][input[1]] == 0){
            lastMove = input
            grid[input[0]][input[1]] = symbol
            grid
        } else{
            println("Už je obsazeno :)")
            grid
        }
    }
}