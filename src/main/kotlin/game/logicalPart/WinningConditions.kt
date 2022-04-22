package game.logicalPart

class WinningConditions {
    fun isWinning(grid: Array<IntArray>, playerOnMove: Int, mustHaveInRow: Int): Boolean {
        val values = mutableListOf<Int>()
        for (i in grid) {
            values.addAll(i.toList())
        }
        for (i in values.indices) {
            if (check(values, playerOnMove, i, mustHaveInRow, 1, 1)) {
                return true
            } else if (check(values, playerOnMove, i, mustHaveInRow, 1, grid.size)) {
                return true
            } else if (check(values, playerOnMove, i, mustHaveInRow, 1, grid.size + 1)) {
                return true
            }
        }
        return false
    }

    private fun check(
        values: List<Int>,
        playerOnMove: Int,
        position: Int,
        mustHaveInRow: Int,
        inRow: Int,
        moveBy: Int
    ): Boolean {
        try {
            if (values[position] == playerOnMove) {
                if (inRow >= mustHaveInRow) {
                    return true
                }
            } else {
                return false
            }
            return check(values, playerOnMove, position + moveBy, mustHaveInRow, inRow + 1, moveBy)
        } catch (e: Exception) {
            return false
        }
    }
}