import kotlin.math.sqrt
import kotlin.math.abs
fun main(){
    try {
    println("Введите 2 числа");
    val a: Double = readLine()!!.toDouble();
    val b: Double = readLine()!!.toDouble();
    var sredkvadrat=Math.sqrt(a)+Math.sqrt(b)/2
    var sredmodul=Math.abs(a)+Math.abs(b)/2
    println(String.format("Среднее арифмитеское квадратов : %.2f",sredkvadrat))
    println("Среднее арифмитеское модулей : $sredmodul")
    }
    catch(e:Exception) {
        println("Ошибка")
    }
}