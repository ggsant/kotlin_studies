
import java.util.*

interface Time {
    // Understanding interfaces.
    fun setTime(hours: Int, minutes: Int = 0, seconds: Int = 0)

    fun setKelvinTime(time: FooTime) = setTime(time.hours)

    fun currentTime() : Date = Date()

}

interface TimeParser {
    fun parseTimeToReader(date: Date) : String

    fun currentTime() : Date = Date()

}

class FooTime {
    var hours: Int = 0
    var minutes: Int = 0
    var seconds: Int = 0
}

class TimeImpl : Time,TimeParser {

    override fun setTime(hours: Int, minutes: Int, seconds: Int) {
        // set time,
    }

    override fun parseTimeToReader(date: Date): String {
        return date.toString()
    }

    override fun currentTime(): Date {
        // Have our own implementantion
        //return Date()
                // or
        // use either one of the implementations from the base interfaces implemented.
        return super<Time>.currentTime()
    }

}

fun main() {
    val time: Time?
    time = TimeImpl()
    print(time.currentTime())
}