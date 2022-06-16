

fun main() {
    val customBurger = burger {
        toppings {
            meat { "Bacon" }
            meat { "Beef Patty" }
            veggie { "Mushroom" }
            veggie { "Lettuce" }
        }
        condiment { "Mayonnaise" }
        cheese { "Pepper Jack" }
    }
    println(customBurger)

}

// To begin creating our builder, we would start from the top call first, which is a higher-order
// function
//  These are the two most important points about this method:
// 1. The function parameter is a function-type-with-receiver. This allows the function to receive
// the lambda expression right after the burger method call(based on our models described in the
// previous section).
// 2. But passing in the lambda expression is not enough. You still have to execute it using the
// init() call, otherwise the lambda(the one that calls toppings(), condiment(), and cheese()) will
// not be executed. Nobody wants to eat an empty burger.

fun burger(init: Burger.() -> Unit): Burger {
    val builder = Burger()
    builder.init()
    return builder.build()
}

// There are a couple of important points to note in the Burger class.

// The primary empty constructor is public, which allows anybody to create an empty Burger, but this is only required for the extension function(the function-type-with-receiver) init() to work.
// The secondary constructor is private, and the only way to obtain a Burger instance is through the build() function.
// The properties of Burger are lateinit and you can check if the properties have been initialized using .isInitialized on the reference to that property. You can implement this check into your own builder if you wish, but for brevity, I am skipping that logic.
// Notice how the toppings() function follow the same pattern as the higher-order function burger(). This is the proper way to chain function calls.
// The condiment() and cheese() functions do not follow the same pattern above because there are no sub categories in them, so they are only taking a function type lambda(without receiver). You might be able to just require a String as the parameter, but then your DSL grammar would be inconsistent.

class Burger() {
    private lateinit var toppings: Toppings
    private lateinit var condiment: Condiment
    private lateinit var cheese: Cheese

    private constructor(toppings: Toppings, condiment: Condiment, cheese: Cheese) : this(){
        this.toppings = toppings
        this.condiment = condiment
            this.cheese = cheese
        )
    }

    fun build(): Burger = Burger(toppings, condiment, cheese)

    fun toppings(init: Toppings.() -> Unit) {
        toppings = Toppings()
        toppings.init()
    }

    fun condiment(init: () -> String){
        condiment = Condiment(init())
    }

    fun cheese(init: ()->String) {
        cheese = Cheese(init())
    }
    
    override fun toString(): String {
        return "Burger(toppings=$toppings, condiment=$condiment, cheese=$cheese)"
}

class Toppings() {
    private val meats = mutableSetOf<Meat>()
    private val veggies = mutableSetOf<Veggie>()

    fun meat(init: () -> String) {
        meats.add(Meat(init()))
    }

    fun veggie(init: () -> String) {
        veggies.add(Veggie(init()))
    }

    override fun toString(): String {
        return "Toppings(meats=$meats, veggies=$veggies)"
    }
}

data class Meat(val name: String)

data class Veggie(val name: String)

data class Condiment(val name: String)

data class Cheese(val name: String)
