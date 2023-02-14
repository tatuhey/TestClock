import kotlin.math.min

class Clock constructor (hour: Int = 0, minute: Int = 0, second: Int = 0){

    var hour: Int = 0
        get(){
            if (field > 24 || field < 0) println("Wrong hour")
            return field
        }
        set(value){
            field = when{
                value < 0 -> 0
                value > 24 -> 0
                else -> value
            }
        }

    var minute: Int = 0
        get(){
            if (field < 0 || field > 60) println("Wrong second")
            return field
        }
        set(value){
            field = when{
                value <0 -> 0
                value > 60 -> 0
                else -> value
            }
        }
    var second: Int = 0
        get(){
            if (field < 0 || field > 60) println("Wrong second")
            return field
        }
        set(value){
            field = when{
                value <0 -> 0
                value > 60 -> 0
                else -> value
            }
        }
    init{
        this.hour = hour
        this.minute = minute
        this.second = second
    }
//    constructor(hour, minute, second) : this(hour, minute, second){
//
//    }

    fun reset(){
        hour = 0
        minute = 0
        second = 0
    }

    fun oneSecond() {
        second++
        if (second >= 60) {
            second = 0
            minute++
            if (minute >= 60) {
                minute = 0
                hour++
                if (hour == 24) {
                    hour = 0
                }
            }
        }
    }
}




