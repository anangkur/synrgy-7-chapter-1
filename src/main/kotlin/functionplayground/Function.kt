package functionplayground

import classplayground.Car

public fun main(): Unit {
    println("==========")
    println("sum: ${sum(10, 10)}")
    println("sum with default parameters: ${sum()}")
    println("subtract: ${subtract(number2 = 10, number1 = 5)}")
    println("isPasswordValid: ${"abcde".validatePassword()}")
    println("lambda: ${sumLambda(10, 10)}")
    "vwxyz".doAfterValidatePassword(
        doWhenSuccess = {
            println("password benar!")
        },
        doWhenFailed = {
            println("password salah!")
        },
    )
    applyAlsoAndLetExample()
    println(Car().transformToStringWithRun())
    return Unit
}

private fun sum(
    number1: Int = 0,
    number2: Int = 0,
): Int {
    return number1 + number2
}

private fun subtract(
    number1: Int,
    number2: Int,
): Int {
    return number1 - number2
}

private fun String.validatePassword(
    mustHave: String = "X",
): Boolean {
    return this.isNotEmpty()
            && this.isNotBlank()
            && this.isMoreThan8()
            && this.containsMustHaveChar(mustHave)
}

// buatlah extension function dari class String / CharSequence
// untuk memeriksa apakah panjang dari String / CharSequence
// tersebut lebih dari 8
private fun String.isMoreThan8(): Boolean {
    return this.length > 8
}

private fun String.containsMustHaveChar(mustHave: String): Boolean {
    return this.contains(mustHave)
}

private val sumLambda: (Int, Int) -> Int = { a: Int, b: Int ->
    a + b
}

private fun String.doAfterValidatePassword(
    doWhenSuccess: () -> Unit = {},
    doWhenFailed: () -> Unit = {},
) {
    if (this.validatePassword()) {
        doWhenSuccess()
    } else {
        doWhenFailed()
    }
}

private fun applyAlsoAndLetExample(): Car? {
    return Car().also {
        println("before apply electricCar: ${it.transformToString()}")
    }.apply {
        wheel = 3
        isElectric = true
        brand = "Binar"
    }.also {
        println("after apply electricCar: ${it.transformToString()}")
    }?.let {
        it
    }
}

fun Car.transformToString(): String {
    return with(this) {
        "wheel: $wheel, " +
                "isTransformable: $isTransformable, " +
                "isElectric: $isElectric, " +
                "brand: $brand."
    }
}

/**
 * this function is an example of using scope function: run
 * for more information go to: [link](http://localhost)
 */
fun Car.transformToStringWithRun(): String {
    return this.run {
        "wheel: $wheel, " +
                "isTransformable: $isTransformable, " +
                "isElectric: $isElectric, " +
                "brand: $brand."
    }
}