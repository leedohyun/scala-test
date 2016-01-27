import java.io.File

import scala.io.Source

/**
  * Created by leedohyun on 2016. 1. 27..
  */
object ForLoop {
  def main(args: Array[String]): Unit = {
    val filesHere = (new File("./src")).listFiles()
    for {
      file <- filesHere
      if file.isFile && file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(".*object.*")
    } println(file + ": " + trimmed)

    val files = for {
      file <- filesHere
      if file.isFile && file.getName.endsWith(".scala")
    } yield file
    println(files.length)

    println(f)

    println(makeRowSeq(10))
  }

  def fileLines(file: java.io.File) =
    Source.fromFile(file).getLines().toList

  def f(): Int =
    try {
      1
    } finally {
      2
    }

  def makeRowSeq(row: Int) = {
    for (col <- 1 to 10) yield col
  }


}
