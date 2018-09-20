package degiskenler

fun main(args: Array<String>) {
    var isTrue : Boolean = 5<6
    println("isTrue değeri $isTrue")

    var ilkHarf : Char = 'a'
    var ikinciHarf : Char = 'b'
    println("ilk harf $ilkHarf ikinci harf $ikinciHarf")

    var isim : String = "Emre Aydın"
    println("Benim adım $isim \n"+"ayrıcı ismimin karakter sayısı ${isim.length-1}")
    println(isim.get(0))
}