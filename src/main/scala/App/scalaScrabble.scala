package App

import scala.io.StdIn

object scalaScrabble extends App {


  val dict = scala.io.Source.fromFile("/usr/share/dict/british-english").getLines.toSet

  val input = StdIn.readLine("Give me a word \n").toLowerCase

  val letters: List[Char] = input.toList

  def WordChecker(): Unit = {
    if (dict(input))
      println("This is a word!")
    else {
      println("That is not a word! TWAT!")
    }
  }

}


