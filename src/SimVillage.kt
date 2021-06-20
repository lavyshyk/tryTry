class SimVillage

fun main() {
    val sample = {a: String -> a.toInt(35) }
    runSimulation()
    runSample("vlad", ::printConstructionCost, sample)
 }

fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Vlad"))
    println(greetingFunction("Vlad"))

//    println(greetingFunction("Vlad"))
}

fun configureGreetingFunction(): (String) -> String {
    val structureType = listOf<String>("hospital", "station", "school").shuffled().first()
    var numBuildings = (1..5).shuffled().last()
    return { playerName: String ->
        val currentYear = 2021
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage< $playerName! (copyright $currentYear)"
    }
}
fun runSample(playerName: String, costPrinter: (Int) -> Unit, sample: ((String) -> Int)){

}

fun printConstructionCost(numBuildings: Int){
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}