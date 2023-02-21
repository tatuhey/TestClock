fun main(args: Array<String>) {
    val c = Clock()

    c.hour = 0
    c.minute = 0
    c.second = 0

    fun prompt() {
        println("The current time ==> ${c.hour}:${c.minute}:${c.second}")
        println("Enter 's' to set the time")
        println("Enter 'a' to advance one second")
        println("Enter 'r' to reset the clock")
        println("Enter 'q' to quit")

    }

    while (true) {
        prompt()

        var answer: String = readLine().toString()
        when (answer) {
            "s" -> {
                println("Now you can set the clock")
                print("Enter hour 0 ~ 23: ")
                c.hour = readLine()!!.toInt()
                print("Enter minute 0 ~ 59: ")
                c.minute = readLine()!!.toInt()
                print("Enter second 0 ~ 59: ")
                c.second = readLine()!!.toInt()
            }

            "a" -> c.oneSecond()
            "r" -> c.reset()
            "q" -> break
            else -> println("Wrong command.")
        }
    }
}
