import kotlin.math.ln

fun main(args: Array<String>) {
        val drinkRep = DrinkRep()
        drinkRep.insert(Drink(0, "Dr Bopper","carbonated",44.99))
        drinkRep.insert(Drink(1, "KD cola","carbonated",31.99))
        drinkRep.insert(Drink(2, "Gardens of Pridonya","Apple juice",40.99))
        drinkRep.printAll()
        println("_find id 2_")
        drinkRep.deleteById(id=1)
        println(drinkRep.findById(2))
        println("_deleted id 1_")
        drinkRep.printAll()
    }

