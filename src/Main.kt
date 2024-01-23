import kotlin.math.abs

fun main(args: Array<String>) {
    var input = 0
    var temp = 98
    var value = 0

        print("Please enter the temp: ")

        input = readLine()!!.toInt()
        value = abs(input)
        if (value > temp)
            println("High")
        else if (value == temp)
            println("Normal")
        else if (value < temp)
            println("Low")

}