package classplayground

fun main() {
    val electricCar = Car()
    electricCar.isElectric = true
    println("==========")
    println(electricCar.makeSound())
    println(electricCar.checkWheels())

//    val notElectricCarJava = CarJava()
//    notElectricCarJava.wheel = 5
//    notElectricCarJava.electric = false
//    notElectricCarJava.transformable = true
//    println(notElectricCarJava.makeSound())

    val notElectricCar = Car(3)
    println("==========")
    println(notElectricCar.checkWheels())

    ObjectExample.printName("Anang")

    val enumExample = EnumExample.KOTLIN
    val enumTransformed = when (enumExample) {
        EnumExample.JAVA -> "Java"
        EnumExample.KOTLIN -> "Kotlin"
        EnumExample.JAVA_SCRIPT -> "JavaScript"
    }
    println("==========")
    println(enumTransformed)

    val sealedClassExample: SealedClassExample = SealedClassExample.Kotlin("Kotlin")
    val sealedClassTransformed = when (sealedClassExample) {
        is SealedClassExample.Java -> sealedClassExample.name
        is SealedClassExample.JavaScript -> sealedClassExample.name
        is SealedClassExample.Kotlin -> sealedClassExample.name
    }
    println("==========")
    println(sealedClassTransformed)

    println("==========")
    println(Car.showWindow())
    println(CarJava.showWindow())
}