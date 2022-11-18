class drinkDB {
    var drinks = mutableListOf<Drink>()

    fun insertToList(drink : Drink) = drinks.add(drink)
    fun delete(drink : Drink) = drinks.remove(drink)
    fun deleteById(id : Int) = drinks.removeAt(id)
    fun findById(id : Int) : Drink? = drinks.find { it.id == id }
}