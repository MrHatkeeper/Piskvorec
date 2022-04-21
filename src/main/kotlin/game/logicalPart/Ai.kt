package game.logicalPart

class Ai {
    var lastMove = IntArray(2)

    fun makeMove(grid: Array<IntArray>, symbol: Int, lastPreviousMove: IntArray): Array<IntArray> {
        val cooX = (lastPreviousMove[1] - 1..lastPreviousMove[1] + 1).random()
        val cooY = (lastPreviousMove[0] - 1..lastPreviousMove[0] + 1).random()

        grid[cooY][cooX] = symbol
        return grid
    }
}