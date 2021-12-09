fun main() {
    val n = readLine()!!.toInt()
    val list: MutableList<Int> = mutableListOf()
    for (index in 0 until n) {
        list.add(readLine()!!.toInt())
    }
    if (readLine()!!.toInt() in list) {
        print("YES")
    } else {
        print("NO")
    }
}