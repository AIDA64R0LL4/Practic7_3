import kotlin.math.sqrt
fun main() {
    println("Введите длины 3 отрезков")
    try {
        val a: Double = readLine()!!.toDouble();
        val b: Double = readLine()!!.toDouble();
        val c: Double = readLine()!!.toDouble();
        if (Math.sqrt(a) == Math.sqrt(b) && Math.sqrt(b) == Math.sqrt(c)) {
            println("Треугольник будет прямоугольным")
        } else {
            println("Треугольник не будет прямоугольным")
        }
    }
        catch(e:Exception) {
            println("Ошибка")
        }


}