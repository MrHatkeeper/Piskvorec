package game.logicalPart

import game.iO.TextInputs

class Player {
    val ti = TextInputs()
    fun makeMove(grid: Array<IntArray>, symbol: Int): Array<IntArray>{
        val input = ti.getPlayerInput()

        return if(grid[input[0]][input[1]] == 0){
            grid[input[0]][input[1]] = symbol
            grid
        } else{
            println("Už je obsazeno :)")
            grid
        }
    }
}