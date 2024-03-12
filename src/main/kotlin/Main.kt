import java.util.Stack
import kotlin.random.Random

fun main() {
    val variable1: Int = 0 // immutable -> tidak bisa diubah
    var variable2: String = "" // mutable -> bisa diubah

    variable2 = "Synrgy"

    println("==========")
    println("variable1: $variable1")
    println("variable2: $variable2")

    val variable3: Boolean = false // true, false (1 bits)
    val variable4: Float // desimal (angka dengan koma) ex: 3.5 dsb (32 bits, 6-7 decimal digits)
    val variable5: Long // integer, hanya saja digit nya terbatas (64 bit, -9,223,372,036,854,775,808 (-263) - 9,223,372,036,854,775,807 (263 - 1))
    val variable6: Char = 'a' // tulisan yang punya batas huruf (length)
    val variable7: String = "abcdef123456" // tulisan yang tidak terbatas (bisa didefinisikan juga sebagai array of char)
    val variable8: Int // ~~angka yang tak terbatas~~ (32 bit, -2,147,483,648 (-231) - 2,147,483,647 (231 - 1))
    val variable9: Array<Int> = arrayOf(1,2,3,4,5) // kumpulan data dengan tipe data yang sama yang digabungkan
    val arrayOfChar: Array<Char> = arrayOf('a','b','c','d','e')
    val variable10: Byte // seperti integer namun memakan memori lebih kecil dibanding integer (8 bits, -128 - 127)
    val variable11: Double // desimal (64 bits, 15-16 max decimal digits)
    val variable12: Short // bilangan integer tapi lebih kecil (16 bits, -32768 - 32767)
    val charSequence: CharSequence = variable7

    val notelp = 800L
    println("==========")
    println("notelp: $notelp")
    println("arrayOfChar: ${arrayOfChar.joinToString(separator = "")}")

    val number1: Int = 1
    val number2: Int = 2
    val resultOfAdd: Long = number1.toLong() + number2.toLong()
    val resultOfSubtraction: Int = number1 - number2
    val resultOfDiv: Float = number1.toFloat() / number2.toFloat()
    val resultOfMultiplication = number1 * number2
    val resultOfMod = number1 % number2
    val resultOfMod2 = 2 % 2

    println("==========")
    println("resultOfAdd: $resultOfAdd")
    println("resultOfSubtraction: $resultOfSubtraction")
    println("resultOfDiv: $resultOfDiv")
    println("resultOfMultiplication: $resultOfMultiplication")
    println("resultOfMod: $resultOfMod")
    println("resultOfMod2: $resultOfMod2")

    val boolean1 = true
    val boolean2 = false
    val resultOr = boolean1 || boolean2
    val resultAnd = boolean1 && boolean2
    val resultNegation = !boolean1
    println("==========")
    println("resultOr: $resultOr")
    println("resultAnd: $resultAnd")
    println("resultNegation: $resultNegation")

    val escapedString = "menu: \n1. Menu 1 \n2. Menu 2"
    val rawString = """test raw 
string"""
    val concatString1 = "aku adalah"
    val concatSpace = " "
    val concatString2 = "anak gembala"
    val resultConcat = concatString1 + concatSpace + concatString2
    val template1 = "topi"
    val template2 = "saya"
    val template3 = "bundar"
    val template4 = 0
    val resultTemplate = "$template1 $template2 $template3 - ${template4.toString()}"

    println("==========")
    println("escapedString: $escapedString")
    println("rawString: $rawString")
    println("resultConcat: $resultConcat")
    println("resultTemplate: $resultTemplate")

    val array1 = arrayOf(1.0,2.0,3.0,4.0,5.0)
    val array2: Array<Int> = Array(5) { it }
    array1[0] = 9.0
    array2[0] = 1
    array2[1] = 2
    println("==========")
    println("array1: ${array1.joinToString(separator = "")}")
    val array3 = array2.plus(1)
    println("array2: ${array2.joinToString(separator = "")}")
    println("array3: ${array3.joinToString(separator = "")}")

    val list: List<String> = listOf("abc", "def")
    val arrayList: ArrayList<String> = arrayListOf("abc", "def")
    arrayList.add("ghi")
    arrayList.remove("def")
    println("==========")
    println("list: $list")
    println("arrayList: $arrayList")
    val list2 = list.subList(0,1)
    println("list2: $list2")
    val stack = Stack<Int>()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.pop()
    println("stack: $stack")
    println("stack.peek(): ${stack.peek()}")

    println("==========")
    if (false) {
        println("ini kondisi 1")
    } else {
        println("ini kondisi terakhir")
    }

    if (false) {
        println("ini kondisi 1")
    } else if (true) {
        println("ini kondisi 2")
    } else {
        println("ini kondisi terakhir")
    }

    val resultIfElse = if (false) {
        "ini kondisi 1"
    } else if (false) {
        "ini kondisi 2"
    } else {
        "ini kondisi terakhir"
    }
    println(resultIfElse)

    println("==========")
    val word = "a"
    val resultWhen = when (word) {
        "A", "a" -> {
            4
        }
        "B" -> {
            3
        }
        "C" -> {
            2
        }
        "D" -> {
            1
        }
        else -> {
            0
        }
    }
    println("resultWhen: $resultWhen")

    val nilai = 75
    val resultWhen2 = when (nilai) {
        in 0..40 -> {
            "D"
        }
        in 41..60 -> {
            "C"
        }
        in 61..80 -> {
            "B"
        }
        in 81..100 -> {
            "A"
        }
        else -> "A"
    }
    println("resultWhen2: $resultWhen2")

    println("==========")
    val range = 0..10
    val rangeWithStep = 0..100 step 10
    val rangeDown = 10..0 step 1
    val rangeTo = 0.rangeTo(10)
    val rangeToWithStep = 0.rangeTo(100).step(10)
    val downTo = 10.downTo(0)
    val downToWithStep = 100.downTo(0).step(10)
    println("range: ${range.joinToString()}")
    println("rangeWithStep: ${rangeWithStep.joinToString()}")
    println("rangeDown: ${rangeDown.joinToString()}")
    println("rangeTo: ${rangeTo.joinToString()}")
    println("rangeToWithStep: ${rangeToWithStep.joinToString()}")
    println("downTo: ${downTo.joinToString()}")
    println("downToWithStep: ${downToWithStep.joinToString()}")

    println("==========")
    println("Menu: \n1. Menu 1\n2. Menu 2\n3. Menu 3\n4. exit")
    print("silahkan masukkan pilihan: ")
    // val input = readLine()?.toIntOrNull()
    when (2) {
        1 -> println("Ini adalah menu 1")
        2 -> println("ini adalah menu 2")
        3 -> println("ini adalah menu 3")
        4 -> println("terimakasih!")
        5 -> throw UnsupportedOperationException("pilihan tidak ada")
        else -> println("input anda salah")
    }

    println("==========")
    val arrayOfName = arrayOf("a", "b", "c", "d", "e")
    arrayOfName.forEach { name ->
        print(name)
    }
    println()

    for (number in 0..10) {
        print(number)
    }
    println()

    for (number in 0..100 step 10) {
        print(number)
    }
    println()

    for (name in arrayOfName) {
        print(name)
    }
    println()

    println("==========")
    while (false) {
        println(Random(100).nextInt().toString())
    }

    var index = 0
    val comparison = index < arrayOfName.size
    while (comparison) {
        print(arrayOfName.get(index))
        index = index + 1
    }
    println()

    index = 0
    while (index < arrayOfName.size) {
        print(arrayOfName.get(index))
        index += 1
    }
    println()

    index = 0
    while (index < arrayOfName.size) {
        print(arrayOfName.get(index))
        index++
    }
    println()

    var input: Int = 0 // non-nullable
    while (false) {
        println("==========")
        println("Menu: \n1. Print Segitiga\n2. Print Segitiga Terbalik\n3. Print Diamond\n4. Print X\n5. Print Segitiga Outline\n6. Exit")
        print("silahkan masukkan pilihan: ")
        input = readLine()?.toIntOrNull() ?: 0
        when (input) {
            1 -> println("Ini adalah Segitiga")
            2 -> println("ini adalah Segitiga Terbalik")
            3 -> println("ini adalah Diamond")
            4 -> println("ini adalah X")
            5 -> println("ini adalah Segitiga Outline")
            6 -> println("terimakasih!")
            -1 -> throw UnsupportedOperationException("Selamat kamu kena error!")
            else -> println("input anda salah")
        }
    }

    println("==========")
    do {
        println("ini do while")
    } while (false)

    while (false) {
        println("ini while do")
    }

    println("==========")
    while(true) {
        val randomNumber = (0..100).random()

        if (randomNumber % 10 == 0) {
            break
        } else if (randomNumber % 3 == 0) {
            continue
        }

        println("randomNumber: $randomNumber")
    }
    println("test")
}