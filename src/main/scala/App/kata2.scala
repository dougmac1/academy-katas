package App

import scala.io.StdIn

object kata2 extends App  {

  val input = StdIn.readLine("Enter a word \n")
  val num = StdIn.readLine("Enter a number \n").toInt

  println((s"$input ") * num)

}
