
import java.util.*

class WithApply {

    var title: String = ""
    var releaseDate: Date = Date()
    var author = mutableListOf<String>()
}

fun main() {
    val withApply = WithApply()
    withApply.title = "Board Meeting"
    withApply.releaseDate = Date(2020,1,1)
    withApply.author.add("Kamau Brian")


    // Initializing using the with
    with(withApply){
        title = "We shall sing a new song"
        releaseDate = Date(2020,5,12)
        author.add("Kamau Brian")
    }

    withApply.apply {
        this.title = "We shall sing a new song"
        this.releaseDate = Date(2020,5,12)
        this.author.add("Kamau Brian G")
    }
}