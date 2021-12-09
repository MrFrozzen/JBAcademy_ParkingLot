fun main() {
    val input = readLine()!!
    var firstHalf = 0
    var secondHalf = 0
    for (i in 0..2) {
        firstHalf += input[i].code
        secondHalf += input[i + 3].code
    }
    print(if (firstHalf == secondHalf) "Lucky" else "Regular")
}