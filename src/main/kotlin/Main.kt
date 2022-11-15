
val progName: String? = "Carol "
var greeting: String? = null

fun main(args: Array<String>) {
    println("Hello Carol!")
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.

    val number= readLine() ?: "0"
    val parsedNumber = try {
        number.toInt()
    } catch (e: Exception) {
        0
    }
    println(parsedNumber)

    val list = listOf("Kotlin", "is", "fun")

    /* Lambda Functions   */
    val count = list.customCount { currentString ->
        currentString.length >= 3
    }
    println(count)

    /*  */
    val x = isEven(5)
    val y = 3
    println(y.isOdd())

    /* Ways to use 'when'    */
    val z = 3

    when (z){
        in 1..2 -> println("X is between 1 and 2")
        in 3..10 -> println("X is between 1 and 2")
        else -> {
            println("X is not in the range of 1 to 10")
        }
    }

    when (greeting){
        null -> println("Nothing to report")
        else -> println("greeting")
    }

    /* If compression statement */
    val greetingToPrint = if (greeting != null) greeting else "Hi"
    println(progName)

    val cat = Cat()
    cat.makeSound()
    cat.legCount

    val dog = Dog()
    dog.makeSound()
    dog.legCount

    val bear = object : Animal("Commonbear") {
        override fun makeSound() {
            println("ROOAR")
        }
    }

    /* Last print statement in main() */
    println("Practice To Lear program arguments: ${args.joinToString()}")
}

/* Making functions to call from main() */
fun isEven(number: Int = 10 ): Boolean{
    return number % 2 == 0
}

fun print10Numbers(){
    for(i in 1..10){
        println(i)
    }
}

/* Extension function */
fun Int.isOdd(): Boolean {
    return this % 2 == 1
}

fun <T> List<String>.customCount(function: (T) -> Boolean): Int {
    var counter = 0
    for(string in this){
        if(function(string)){
            counter++
        }
    }
    return counter
}

