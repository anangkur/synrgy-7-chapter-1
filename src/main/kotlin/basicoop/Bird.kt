package basicoop

open class Bird : Animal(), FlyAble {
    override fun move() {
        TODO("Not yet implemented")
    }

    override fun breath() {
        println("bernafas dengan paru-paru!")
    }

    fun eat(isPoison: Boolean) {
        if (isPoison) {
            health--
        } else {
            health++
        }
    }

    fun eat(isPoison: Boolean, food: Int) {
        if (isPoison) {
            health -= food
        } else {
            health += food
        }
    }

    override fun fly() {
        TODO("Not yet implemented")
    }
}