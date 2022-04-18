package game.iO

class TextInputs {
    fun getInput(): IntArray{
        println("Zadej kolik na kolik má být herní pole: ")
        val v = readln().split(" ")
        return intArrayOf(v[0].toInt(), v[1].toInt())
    }

    fun getAmountPlayers(): Int{
        println("Kolik hráčů má hrát ?")
        return readln().toInt()
    }
}