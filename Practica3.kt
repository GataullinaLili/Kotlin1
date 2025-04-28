fun main() {
    println("Введите 4-значное число:")
    val n = readLine()

    if (n != null && n.length == 4 && n.all { it.isDigit() }) {
        val a = n.toList() // Преобразуем строку в список символов

        println("Результат: ${a.joinToString(", ")}")
    } else {
        println("Ошибка: пожалуйста, введите корректное 4-значное число.")
    }
}
