fun main() {
    fun isOverlapCompletely(r: List<String>): Boolean{
        return if (r[0].toInt() >= r[2].toInt() && r[1].toInt() <= r[3].toInt())
            true
        else
            r[2].toInt() >= r[0].toInt() && r[3].toInt() <= r[1].toInt()
    }
    fun part1(input: List<String>): Int {
        var suma=0
        input.forEach{
            val l = it.replace("-", ",").split(",")
            if(isOverlapCompletely(l)){
                suma++
            }
        }
        return suma
    }

    fun isOverlap(r: List<String>): Boolean{
        return r[2].toInt() in r[0].toInt()..r[1].toInt()
                || r[3].toInt() in r[0].toInt()..r[1].toInt()
                || r[0].toInt() in r[2].toInt()..r[3].toInt()
                || r[1].toInt() in r[2].toInt()..r[3].toInt()
    }
    fun part2(input: List<String>): Int {
        var suma=0
        input.forEach{
            val l = it.replace("-", ",").split(",")
            if(isOverlap(l)){
                suma++
            }
        }
        return suma
    }

    val input = readInput("input4")
    println(part1(input))
    println(part2(input))
}
