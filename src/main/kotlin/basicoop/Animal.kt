package basicoop

abstract class Animal {

    var health: Int = 100

    abstract fun move()

    fun checkHealth() {
        println("health: $health")
    }

    fun eat() {
        health++
    }

    fun eat(food: Int) {
        health += food
    }

    open fun breath() {
        println("hewan bisa bernafas!")
    }
}