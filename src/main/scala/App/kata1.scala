package App

import jdk.internal.util.xml.impl.Input

import scala.io.StdIn

object kata1 extends App  {

  //val x = StdIn.readLine("Input a number \n")toInt

  def countdown (input: Int) = List.range(1, input +1).reverse


  println(countdown(51))
}
