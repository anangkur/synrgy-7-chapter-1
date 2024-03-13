fun main() {
    var input: String // non-nullable
    while (false) {
        showMenu()
        input = readlnOrNull().orEmpty()
        // jalankan extension function yang sudah dibuat di sini
    }
}

private fun showMenu() {
    println("==========")
    println("Menu: \n1. Print Segitiga\n2. Print Segitiga Terbalik\n3. Print Diamond\n4. Print X\n5. Print Segitiga Outline\n6. Exit")
    print("silahkan masukkan pilihan: ")
}

private fun showResult(input: Int?) {
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

// buatlah sebuah extension function untuk validate
// value dari variable input.
// rules:
// input hanya valid jika bernilai angka antara 1..6
// jika nilai input adalah huruf print "input tidak diizinkan, coba lagi"
// jika nilai input adalah angka namun kurang dari 1 print "input salah, coba lagi"
// jika nilai input adalah angka namun lebih dari 6 print "input melebihi menu yang disediakan, coba lagi."
// jika input valid panggil function showResult(input: Int?)
