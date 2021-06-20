


class Hello

fun main(args: Array<String>) {
    var n = 3
    val s1= "djdD dl".count { it.isUpperCase() || it == 'j' }
    println(s1)

    textExam(n)


    print("Hello")
    val s = readLine()!!
    println(s.reversed())

}

private fun textExam(n: Int = 5) = fgfg(n)


private fun fgfg(n: Int) {

    var example: String =
        if (n > 3) "n more then 0"
        else " n < 0"
}
