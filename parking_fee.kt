fun main(args: Array<String>) {
    var hours = readLine()!!.toInt()
    var total: Double = 0.0

    var day : Int = hours/24
    var addhours : Int = hours%24
    total = when {
        hours >5 && hours <24 -> 5.0+(hours-5)*0.5
        hours >= 24 -> (addhours*0.5) + (day*15)
        else -> hours*1.0
    }
    println(total)
}
