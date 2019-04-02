fun main (args: Array<String>) {

    var animalsList = mutableListOf<Animals>(

        Mammal(1, "Panda", 1869),
        Mammal(2, "Zebra", 1778),
        Mammal(3, "Koala", 1816),
        Mammal(4, "Sloth", 1804),
        Mammal(5, "Armadillo", 1758),
        Mammal(6, "Raccoon", 1758),
        Mammal(7, "Bigfoot", 2021),

        Birds(1, "Pigeon", 1837),
        Birds(2, "Peacock", 1821),
        Birds(3, "Toucan", 1758),
        Birds(4, "Parrot", 1824),
        Birds(5, "Swan", 1758),

        Fish(1, "Salmon", 1758),
        Fish(2, "Catfish", 1817),
        Fish(3, "Perch", 1758)
    )

    val yearDescending = animalsList.sortedWith(compareByDescending { it.yearNamed })
//    yearDescending.forEach{println("${it.name} - ${it.yearNamed}")}

    val printYearDescending: (Int) -> Unit = { s: Int -> println(s) }

    printYearDescending


}