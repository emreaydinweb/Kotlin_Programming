package degiskenler

fun main(args: Array<String>) {
    var number : Int
    number=15

    println(10*number)

    //number veri türleri
        //byte,short,int,long,float,double
    var ByteMin : Byte      //8bit
    var ByteMax :Byte

    ByteMin= Byte.MIN_VALUE
    println("Byte aldığı en küçük değeri "+ByteMin)

    ByteMax= Byte.MAX_VALUE
    println("Byte aldığı en büyük değeri "+ByteMax)

    var shortMin : Short = Short.MIN_VALUE      //16bit
    var shortMax : Short = Short.MAX_VALUE

    println("Short aldığı minimum değer "+shortMin)
    println("Short aldığı maksimum değer "+shortMax)

    var intMin : Int = Int.MIN_VALUE            //32bit
    var intMax : Int = Int.MAX_VALUE

    println("Int aldığı minimum değer "+intMin)
    println("Int aldığı maxsimum değer "+intMax)

    var longMin : Long = Long.MIN_VALUE         //64bit
    var longMax : Long = Long.MAX_VALUE

    println("Long aldığı minimum değer "+longMin)
    println("Long aldığı maxsimum değer "+longMax)

    var floatMin : Float = Float.MIN_VALUE      //32bit
    var floatMax : Float = Float.MAX_VALUE

    println("Float aldığı minimum değer "+floatMin)
    println("Float aldığı maximum değer "+floatMax)

    var doubleMin : Double = Double.MIN_VALUE   //64bit
    var doubleMax : Double = Double.MAX_VALUE

    println("Double aldığı minimum değer ${doubleMin} \n")
    println("Double aldığı maximum değer $doubleMax")



}