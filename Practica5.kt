fun main() {
    println("Введите число:")
    val a = readLine()?.toIntOrNull()
    
    if (a != null) {
        val result = "$a${a * 2}"
        println("Получаем: $result")
    } else {
        println("Пожалуйста, введите корректное число.")
    }
}
