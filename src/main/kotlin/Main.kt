fun main(args: Array<String>) {
    // var : variable
    // val : value = constant
    // true, false
    // &&, ||
    // string.toUpperCase()
    // Kotlin has null safety

    //val num1 = readLine() ?: "0" // Assign "0" if null
    //val num2 = readLine() ?: "0"
    //val result = num1.toInt() + num2.toInt() //Gives error otherwise,
    // println(result)
    // Double exclamation means not null

    //val shoppingList = listOf<String>("Galaxy Watch 5 Pro", "Samsung Galaxy S22 Ultra", "Cat Food")
    //val shoppingList = mutableListOf<String>("Galaxy Watch 5 Pro", "Samsung Galaxy S22 Ultra", "Cat Food")
    //shoppingList.add("Chocolate")
    //println(shoppingList[0])
    /*for (shoppingItem in shoppingList) {
        println(shoppingItem)
    }*/
    /*for (i in 1 until shoppingList.size) {
        println(shoppingList[i])
    }*/

    /*val x : Int = 3
    when (x) {
        in 1..2 -> println("in between 1 and 2")
        in 3..10 -> println("in between 3 and 10")
        else -> {
            println("not in the range of 1 to 10")
        }
    }*/

    /*fun isEven(number: Int): Boolean {
        return number % 2 == 0;
    }
    println(isEven(5))
    */

    /*fun Int.isOdd(): Boolean {
        return this % 2 == 1
    }
    println(4.isOdd())
    */

    /*val dog = Dog()
    dog.makeSound()
    val cat = Cat()
    cat.makeSound()
    val bear = object : Animal("Bear") {
        override fun makeSound() {
            println("Roarr")
        }
    }
    bear.makeSound()
    */

    /*val number = readLine() ?: "0"
    val parsedNumber = try {
        number.toInt()
    } catch (e: Exception) {
        0
    }
    println(parsedNumber)
    */


}