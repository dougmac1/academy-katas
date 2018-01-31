package App

import jdk.internal.util.xml.impl.Input

import scala.io.StdIn

object scrabble1 extends App {

  val dictionary = scala.io.Source.fromFile("/usr/share/dict/british-english").getLines.toSet

  val input = StdIn.readLine("Input a word \n").toLowerCase
  val chars: List[Char] = input.toList

  val score = Map("E" -> 1, "A" -> 1, "I" -> 1, "O" -> 1, "N" -> 1, "R" -> 1, "T" -> 1, "L" -> 1, "S" -> 1, "U" -> 1,
    "D" -> 2, "G" -> 2, "B" -> 3, "C" -> 3, "M" -> 3, "P" -> 3, "F" -> 4, "H" -> 4, "V" -> 4, "W" -> 4,
    "Y" -> 4, "K" -> 5, "J" -> 8, "X" -> 8, "Q" -> 10, "Z" -> 10)

  println(dictionary(input))

  class total

  class wordChecker(input: String) {
    if chars.toSet == dictionary
  }

}









//object scrabble extends App{
//
//  val input = StdIn.readLine("Input a word \n").toList
//  val chars: List[Char] = input.toList
//
//  val makeTiles: List[Tile] = chars.map((char: Char) => new Tile(char.toString))
//
//  val fullWord = new Word(makeTiles)
//
//  val scoreOfWord = fullWord.calculateScore(makeTiles)
//}
//
//class Tile (val letter: String, val point: Int) {
//
//  val score = Map("E" -> 1, "A" -> 1, "I" -> 1, "O" -> 1, "N" -> 1,"R" -> 1, "T" -> 1, "L" -> 1, "S" -> 1, "U" -> 1,
//    "D" -> 2, "G" -> 2, "B" -> 3, "C" -> 3, "M" -> 3, "P" -> 3, "F" -> 4, "H" -> 4, "V" -> 4, "W" -> 4,
//    "Y" -> 4, "K" -> 5, "J" -> 8, "X" -> 8, "Q" -> 10, "Z" -> 10)
//
//  def this (letter: String ) = this(letter : String, findValue(letter.toUpperCase))
//
//  def findValue(str: String): Tile = {
//    val points = score(letter)
//    val tile = new Tile(letter, points)
//    tile
//  }
//
//}
//
//class Word(tiles: List[Tile]) {
//
//  def calculateScore(tiles: List[Tile]) : Int = {
//    val scrabbleWord = tiles.foldRight("")((tile, acc) => acc + tile.letter)
//
//    val dictionary: Set[String] = scala.io.Source.fromFile("/usr/share/dict/british-english").getLines.toSet
//
//    if (dictionary.exists(p => p.toString == scrabbleWord)) {
//      tiles.foldRight(0)(_.point + _)
//    } else {
//      0
//    }
//  }
//}
