fun main() {
    print("Введите слова через пробел: ")
    val input = readLine()?.split(" ") ?: emptyList()
    val groupedWords = input.groupBy { it.toCharArray().sorted().joinToString("") }.values.toList()
    println("Результат:")
    groupedWords.forEach { println(it) }
}