data class Person(val age: Int, val greeting: Greeting)
data class Greeting(val specific: Map<String, String>, val default: String)

@DslMarker
annotation class PersonDsl

fun main() {
    val person = buildPerson {
        age = 42
        greeting {
            "Hello" to "father"
            "Hi" to "mother"
            default = "What's up"

            // age = 41
            // Uncommenting the line above will yield a compile error.  
			
			this@buildPerson.age = 43  // But we can still be explicit
        }
    }
    println(person)
}

@PersonDsl
class GreetingBuilder {
    var default = ""
    private val specific = HashMap<String, String>()
    
    infix fun String.to (target: String) { specific[target] = this }
   
    fun build(): Greeting { return Greeting(specific, default) }
}

@PersonDsl
class PersonBuilder {
    var age = 0
    private val greetingBuilder = GreetingBuilder()
    
    fun greeting(init: GreetingBuilder.() -> Unit) { greetingBuilder.init() }

    fun build(): Person { return Person(this.age, this.greetingBuilder.build()) }
}

fun buildPerson(init: PersonBuilder.() -> Unit): Person {
    val builder = PersonBuilder()
    builder.init()
    return builder.build()
}