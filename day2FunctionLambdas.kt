fun main() {
//    task1Day2()
//    task2Day2()
    task3Day2()
//    task4Day2()

}

fun task1Day2() {
    val hexStr: Int
    print("Moi ban nhap vao so can chuyen qua kieu hexadecimal: ")
    hexStr = readLine()!!.toInt()
    println("$hexStr sau khi chuyen qua kieu hexadecimal la: " + hexStr.toHexString())
}

private fun Int.toHexString(): String {
    return "0x%02X".format(this)
}

fun task2Day2() {
    val binaryStr: String
    print("Moi ban nhap vao so can chuyen qua kieu binary: ")
    binaryStr = readLine()!!.toString()
    println("$binaryStr sau khi chuyen qua kieu binary la: " + binaryStr.toBinaryString())
}

private fun String.toBinaryString(): String {
    return BigInteger(this, 16).toString(2)
}

fun task3Day2() {
    val hexStr: String
    print("Moi ban nhap vao so can chuyen qua kieu binary: ")
    hexStr = readLine()!!.toString()
    val binaryStr = hexStr.turnOffB2b3()
    println(binaryStr)
}

fun String.turnOffB2b3():String{ // Task 3: result of function is a hexadecimal string after turn-off B2b3
    var binary = StringBuilder(Integer.toBinaryString(this.toInt(16)).padStart(Int.SIZE_BITS,'0'))
    binary[13]='0'
    var decimal = Integer.parseInt(binary.toString(),2)
    return Integer.toHexString(decimal).toString()
}

fun task4Day2() {
    val valueFibo = 20
    val a = IntArray(valueFibo)
    a[0] = 0
    a[1] = 1
    for (i in 2 until valueFibo) {
        a[i] = a[i - 2] + a[i - 1]
    }
    for (i in (valueFibo - 1) downTo 0) {
        print(a[i].toString() + " ")
    }
}
