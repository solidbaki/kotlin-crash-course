//open class Animal(  // Open classes can be inherited
abstract class Animal(  // Can't be initialized by itself
    val name: String,
    val legCount: Int = 4
) {
    init {
        println("Hello my name is $name")
    }

    abstract fun makeSound()
}