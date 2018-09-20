package degiskenler

fun main(args: Array<String>) {
    var shortSayi : Short = 32767
    var intSayi : Int

    intSayi = shortSayi.toInt()
    println(intSayi)

    var longSayi : Long = Long.MAX_VALUE
    intSayi = longSayi.toInt()
    print("Veri kaybı yaşanır ")
    println(intSayi)


    var doubleSayi : Double
    doubleSayi = longSayi.toDouble()
    println(doubleSayi)
}