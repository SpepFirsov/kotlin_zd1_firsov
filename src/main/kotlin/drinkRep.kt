class DrinkRep (){
    private var drinks = mutableListOf<Drink>()

    fun insert(drink: Drink)=drinks.add(drink)
    fun delete(drink:Drink)=drinks.remove(drink)
    fun deleteById(id: Int)=drinks.removeAt(id)
    fun findById(id: Int):Drink?=drinks.find {it.id==id}

    fun printAll() {
        println(drinks)
    }
}