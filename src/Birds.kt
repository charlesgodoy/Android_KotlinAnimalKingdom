class Birds(id: Int, name: String, yearNamed: Int): Animals(id, name, yearNamed) {

    override fun move(): String {
        return "${name} flys"
    }

    override fun breathe(): String {
        return "${name} breathes using lungs"
    }

    override fun reproduce(): String {
        return "${name} lays eggs"
    }

}