fun main() {
    // buat contoh menu, ada 6 menu, dan jika user pilih 6 akan exit, selain itu boleh tampilkan apa saja.
    // jika memilih selain menu 6, user tidak boleh dikeluarkan dari aplikasi.
    var menu = true
    while(menu){
        print("""
            1. opsi satu
            2. opsi dua
            3. opsi tiga
            4. opsi empat
            5 opsi lima
            6. opsi enam
            pilih menu : 
        """.trimIndent())
        val opsi = readLine()
        when(opsi){
            "1" -> print ("Opsi satu")
            "2" -> println ("opsi dua")
            "3" -> println ("opsi tiga")
            "4" -> println ("opsi empat")
            "5" -> println ("opsi lima")
            "6" -> {
                menu = false
                println ("program selesai")
            }
        }
    }
}