abstract class Animals (val id: Int, val name: String, val yearNamed: Int) {

    fun eat() {
        println("${name} eats food")
    }

    abstract fun move(): String

    abstract fun breathe(): String

    abstract fun reproduce(): String

}