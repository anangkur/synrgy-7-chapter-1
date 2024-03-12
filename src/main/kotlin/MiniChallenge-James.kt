fun main() {
    // buat contoh menu, ada 6 menu, dan jika user pilih 6 akan exit, selain itu boleh tampilkan apa saja.
    // jika memilih selain menu 6, user tidak boleh dikeluarkan dari aplikasi.
    var input : Int
    while (true){
        displaymenu()
        print ("masukan pilihan :")
        input = readLine()?.toIntOrNull() ?: 0
        when (input){
            1 -> println("Ini Menu 1")
            2 -> println("Ini menu 2")
            3 -> println("ini menu 3")
            4 -> println("Ini menu 4")
            5 -> println("ini menu 5")
            6 -> {
                println("Terimakasih")
                return
            }
        }
    }

}

fun displaymenu(){
    println("""
        1. Menu 1
        2. Menu 2
        3. Menu 3
        4. Menu 4
        5. Menu 5
        6. Exit 
    """.trimIndent())

}