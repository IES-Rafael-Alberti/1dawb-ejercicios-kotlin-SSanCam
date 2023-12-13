fun main() {
    val allCards = Array(12, { i -> i + 1 })
    println("${allCards.first()} - ${allCards.last()}") // => 1 - 12

    val cardNames = arrayOf("Jack", "Queen", "King", 3, false)
    for (index in cardNames.indices) {
        println("Element $index is ${cardNames[index]}")
    }

    for (i in 6 downTo 0 step 3) {
        println(i)
    }
}