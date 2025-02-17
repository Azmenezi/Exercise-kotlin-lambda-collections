fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val transformedNumbers = numbers.map { it * 2 }
    println(transformedNumbers)

    val names = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")
    val filterNames = { listOfName: List<String> -> listOfName.filter { it.contains("a", true) } }
    println(filterNames(names))


}