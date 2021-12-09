fun main() {
    val list = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()
    var sum = 0
    for (i in list.indices) {
        if (list[i] == m) {
            sum++
        }
    }
    println(sum)
}