fun main() {
    var max = Int.MIN_VALUE
    do {
        val n = readLine()!!.toInt()
        if (max < n) max = n
    } while (n != 0)
    println(max)
}