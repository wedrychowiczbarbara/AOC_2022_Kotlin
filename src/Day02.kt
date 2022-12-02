fun main() {

    data class Rule(val move: String, val reward: Int)
    val gameRules = mutableListOf<Rule>(
        Rule("A X", 4),
        Rule("A Y", 8),
        Rule("A Z", 3),
        Rule("B X", 1),
        Rule("B Y", 5),
        Rule("B Z", 9),
        Rule("C X", 7),
        Rule("C Y", 2),
        Rule("C Z", 6),
    )

    fun part1(input: List<String>): Int {
        var suma=0
        input.forEach{
            val s = it
            suma += gameRules.find {it.move == s}?.reward ?: 0
        }
        return suma
    }

    val gameRules2 = mutableListOf<Rule>(
        Rule("A X", 3),
        Rule("A Y", 4),
        Rule("A Z", 8),
        Rule("B X", 1),
        Rule("B Y", 5),
        Rule("B Z", 9),
        Rule("C X", 2),
        Rule("C Y", 6),
        Rule("C Z", 7),
    )

    fun part2(input: List<String>): Int {
        var suma=0
        input.forEach{
            val s = it
            suma += gameRules2.find {it.move == s}?.reward ?: 0
        }
        return suma
    }

    val input = readInput("input2")
    println(part1(input))
    println(part2(input))

}
