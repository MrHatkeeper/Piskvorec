package game.iO

class ReadLn {
    fun getInput(): IntArray{
        println("Zadej kolik na kolik má být pole: ")
        val v = readln().split(" ")
        return intArrayOf(v[0].toInt(), v[1].toInt())
    }
}