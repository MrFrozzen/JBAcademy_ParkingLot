fun main() {
    val number = readLine()!!.toInt()
    var count = 0
    var i = 1

    while (count < number) {
        for (j in 1..i) {
            print("$i ")
            count++
            if (count == number) {
                break
            }
        }
        i++
    }
}
