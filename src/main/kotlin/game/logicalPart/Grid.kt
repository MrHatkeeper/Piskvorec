package game.logicalPart

import game.iO.TextInputs

class Grid {
    private val rdln = TextInputs()
    var grid = Array(0){IntArray(0)}

    fun createGrid(){
        val size = rdln.getInput()
        grid = Array(size[0]){IntArray(size[1]){0} }
    }
}