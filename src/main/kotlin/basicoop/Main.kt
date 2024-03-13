package basicoop

fun main() {
    val animal = Bird()
    animal.breath()

    val dove = Bird()
    dove.breath()
    dove.eat(80)
    dove.eat(true, 10)

    val koi = Fish()
    koi.breath()
    koi.eat(10)
    koi.checkHealth()
}