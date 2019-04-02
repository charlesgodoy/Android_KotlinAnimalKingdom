class Fish(id: Int, name: String, yearNamed: Int): Animals(id, name, yearNamed) {

    override fun move(): String {
        return "${name} swims"
    }

    override fun breathe(): String {
        return "${name} breathes through gills"
    }

    override fun reproduce(): String {
        return "${name} lays eggs"
    }

}