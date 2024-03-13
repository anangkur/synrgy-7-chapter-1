package basicoop.abstraction

class Plane : Vehicle {
    override fun move() {
        println("fly!")
    }

    override fun fuel() {
        println("Solar!")
    }
}