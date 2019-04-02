class Mammal(id: Int, name: String, yearNamed: Int): Animals(id, name, yearNamed) {

    override fun move(): String {
        return "${name} walks"
    }

    override fun breathe(): String {
        return "${name} breathes using lungs"
    }

    override fun reproduce(): String {
        return "${name} gives birth to live young"
    }

}