package example.myapp

//abstract class AquariumFish {
//    abstract val color: String
//}
//
//class Shark: AquariumFish(), FishAction {
//    override val color = "grey"
//    override fun eat() {
//        println("hunt and eat fish")
//    }
//}
//
//class Plecostomus: AquariumFish(), FishAction {
//    override val color = "gold"
//    override fun eat() {
//        println("eat algae")
//    }
//}

class Plecostomus: FishAction, FishColor {
    override val color = "gold"
    override fun eat() {
        println("eat algae")
    }
}

class Shark: FishAction, FishColor {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}

//
//object GoldColor : FishColor {
//    override val color = "gold"
//}
//
//class Plecostomus (fishColor: FishColor = GoldColor):
//    FishAction by PrintingFishAction("eat algae"),
//    FishColor by fishColor
//
//
//class PrintingFishAction(val food: String) : FishAction {
//    override fun eat() {
//        println(food)
//    }
//}

interface FishAction  {
    fun eat()
}

interface FishColor {
    val color: String
}
