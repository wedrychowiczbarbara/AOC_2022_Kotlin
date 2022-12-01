fun main() {
    fun part1(input: List<String>): Int {
        var max=0
        var suma=0
        input.forEach{
            if (it!="")
                suma+=it.toInt()
            else {
                if (suma > max)
                    max = suma
                suma = 0
            }
        }
        return max
    }

    fun part2(input: List<String>): Int {
        var maxThree = arrayListOf<Int>(0, 0, 0)
        var suma = 0
        input.forEach {
            if (it != "") {
                suma =suma+ it.toInt()
            }
            else {
                if (maxThree.any{it<suma} ){
                    maxThree.add(suma)
                    maxThree.sortDescending()
                    maxThree.removeLast()

                }
            suma=0
            }
        }
        return maxThree.sum()
    }
    val testInput = readInput("input1")
    println(part1(testInput))
    println(part2(testInput))

}
