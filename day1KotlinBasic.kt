
fun main() {

    var value: Int
    print("==========================")
    println("Nhap 1 de xem task 1")
    println("Nhap 2 de xem task 2")
    println("Nhap 3 de xem task 3")
    println("Nhap 4 de xem task 4")
    println("Nhap 5 de xem task 5")
    println("Nhap ngoai cac gia tri tren, chuong trinh se tu thoat")
    println("==========================")

    print("Moi ban nhap lua chon: ")
    value = readLine()!!.toInt()

    when (value) {
        1 -> task1()
        2 -> task2()
        3 -> task3()
        4 -> task4()
        5 -> task5()
        else -> println("Cam on da su dung chuong trinh")
    }
}

fun task1() {
        println("Task 1: Write a program to find all numbers divisible by 7 but not multiples of 5, \n" +
            "between 10 and 200 (counting 10 and 200). The resulting numbers will be printed as \n" +
            "strings on a line, separated by commas.")
    println()
    for (num in 10 .. 200) {
        if (num % 7 == 0 && num % 5 !=0) print("$num ,")
    }
}

fun task2() {
    println("Task 2: Write a program that input a two-digit integer number. Convert and printout \n" +
            "the value of inputted number in binary and hexadecimal.\n")

    var n: Int
     n = getNFromKeyboard()
    val binary: String = Integer.toBinaryString(n)
    println("Value of "+n + " in binary is: "+binary)
    val hexadecimal: String = java.lang.Integer.toHexString(n)
    println("Value of "+n + " in hexadecimal is: "+hexadecimal)
}

fun getNFromKeyboard(): Int {
    var n: Int
    while (true) {
        print("Please enter a positive integer with 2 digits: ")
        n = readLine()!!.toInt()
        if (n >= 10) {
            break
        }
    }
    return  n
}

fun task3() {
    println("Task 3: Enter an array of integer numbers a0, a1, a2, ..., an-1. Do not use any other \n" +
            "array, print the above array screen in ascending order.")
    var n: Int
    while (true) {
        print("Please enter (n) the number of elements of the array ( n > 0): ")
        n = readLine()!!.toInt()
        if (n > 0) {
            break
        }
    }
    var arrayInt = IntArray(n)
    for (i in arrayInt.indices) {
        println("Enter the number "+(i+1)+": ")
        arrayInt[i] = readLine()!!.toInt()
    }
    arrayInt.sort()
        print(" Array screen ascending order is: ")
    for (i in arrayInt) {
        print("$i ,")
    }
}

fun task4() {
    println("Task 4 : Enter an string. Count the number of words in the string. Capitalize the first \n" +
            "letter of the word if it begins for a sentence.\n")
    print("Enter any sentence: ")
    val StringInput = readLine()!!
    val strArray = StringInput.split(" ".toRegex()).toTypedArray()
    var count = 0
    for (s in strArray) {
        if (s != " ") {
            count++
        }
    }
    println("The number of words in the string is: " + count)
    println(StringInput.capitalize())

}

fun task5() {
    println("Task 5: Write a program input month and year, print out the number of days that \n" +
            "month.")
    val year: Int
    val month: Int
    print("Pls enter month: ")
    month = readLine()!!.toInt()
    print("Pls enter year: ")
    year = readLine()!!.toInt()
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) print(
        "Number of days is 31"
    ) else if (month == 2 && (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)) {
        print("Number of days is 29")
    } else if (month == 2) {
        print("Number of days is 28")
    } else println("Number of days is 30")
}

