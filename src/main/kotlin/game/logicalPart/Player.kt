package game.logicalPart

import game.iO.TextInputs

class Player {
    var lastMove = IntArray(2)
    val ti = TextInputs()
    fun makeMove(grid: Array<IntArray>, symbol: Int): Array<IntArray>{
        lastMove  = ti.getPlayerInput()

        return if(grid[lastMove[0]][lastMove[1]] == 0){
            grid[lastMove[0]][lastMove[1]] = symbol
            grid
        } else{
            println("Už je obsazeno :)")
            grid
        }
    }
}