package game.iO

class TextOutputs {

    fun showGrid(grid: Array<IntArray>){
        println("\n")
        for(i in grid){
            println(i.contentToString())
        }
    }

    fun winningPlayer(p: Int){
        println("Vyhrává hráč č: $p")
    }
}