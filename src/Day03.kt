fun main() {
    fun countPriority(letter: Char): Int{
        val v = letter.code
        if (v in 65..90) {
            return v - 38
        }
        if (v in 95..126) {
            return v - 96
        }
        return 0
    }

    fun part1(input: List<String>): Int {
        var suma=0
        input.forEach{
            val line = it.toCharArray()
            val l1 = line.copyOfRange(0, line.size/2).asIterable()
            val l2 = line.copyOfRange(line.size/2, line.size).asIterable()
            val c = l1.intersect(l2.toSet())
            suma+=(countPriority(c.first()))
        }
        return suma
    }

    fun part2(input: List<String>): Int {
        var suma=0
        val newInput = input.windowed(3, step = 3)
        newInput.forEach{
            val subset = it[0].toCharArray().asIterable().intersect(
                it[1].toCharArray().asIterable().toSet()
            )
            val result = subset.intersect(
                it[2].toCharArray().asIterable().toSet())
            suma+=(countPriority(result.first()))
        }
        return suma
    }

    val input = readInput("input3")
    println(part1(input))
    println(part2(input))
}
