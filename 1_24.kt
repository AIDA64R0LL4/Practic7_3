fun main() {
    println("Введите диагонали ромба");
    try {
    val a: Int= readLine()!!.toInt();
    val b: Int= readLine()!!.toInt();
    val ploshadromba= (a*b)/2
    println("Площаль ромба равна $ploshadromba")
    }
    catch(e:Exception) {
        println("Ошибка")
    }
}