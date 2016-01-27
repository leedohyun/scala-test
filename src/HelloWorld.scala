import java.io.File

import scala.io.Source

/**
  * Created by leedohyun on 2016. 1. 11..
  */
object HelloWorld {
  def main(args: Array[String]): Unit = {
//    println("Hello World! lee!")
//
//    var capital = Map("US" -> "Washington", "France" -> "Paris")
//    capital += ("Japan" -> "Tokyo")
//    println(capital("France"))
//
//    println(factorial(30))
//
//    println(max(2, 4))
//
//    val greetStrings = new Array[String](3)
//    greetStrings(0) = "Hello"
//    greetStrings(1) = ", "
//    greetStrings(2) = "world!\n"
//    for (i <- 0 to 2)
//      print(greetStrings(i))

    println(formatArgs(Array("asdasd", "asdsd")))

    val res = formatArgs(Array("asdsd", "asdsd"))
    assert(res == "asdsd\nasdsd")


    val acc = new ChecksumAccumulator
    acc.add(2)
    println(acc.checksum())

    println(gcdLoop(1000, 12000))
    println(greet() == ())
  }

  def factorial(x: BigInt): BigInt =
    if (x == 0) 1 else x * factorial(x - 1)

  def max(x: Int, y: Int): Int = {
    if (x > y)
      x
    else
      y
  }

  def formatArgs(args: Array[String]) = args.mkString("\n")

  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y

    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  def greet() { println("hi") }
}
