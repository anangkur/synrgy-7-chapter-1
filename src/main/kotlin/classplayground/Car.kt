package classplayground

class Car(
    val isTransformable: Boolean = false,
) {

    companion object {
        val isHaveWindow = true
        fun showWindow() {
            println("isHaveWindow: $isHaveWindow")
        }
    }

    var wheel: Int = 0
    var isElectric: Boolean = false
    var brand: String = ""

    constructor(wheel: Int) : this() {
        this.wheel = wheel
    }

    constructor(wheel: Int, brand: String) : this(wheel) {
        this.brand = brand
    }

    fun makeSound(): String {
        return if (isElectric) {
            "no sound"
        } else {
            "brrmmmm"
        }
    }

    fun checkWheels(): String {
        return wheel.toString()
    }
}