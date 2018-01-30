object iteration extends App {

}

class Iterator(var list: List[Int]) {
  override def toString: String = "I'm gonna iterate this shit!"

  def hasNext(): Boolean = {
    list.nonEmpty
  }

  def next(): Int = {
    val value: Int = list.head
    list = list.tail
    value
  }
}

val iter = new Iterator(List(1,2,3,4,5 ))


iter.hasNext()
iter.next()

iter.hasNext()
iter.next()

iter.hasNext()
iter.next()

iter.hasNext()
iter.next()

// anonymous functions - will take a list as below e.g oranges

// oranges.foldLeft(define type)((accumulator, item of index) => equation)

val oranges = List(2,4,6,8,79)

/* below we fold left, accumulator is p, l is the index from list - we take
the p + 25 multiply by 231 then multiply by l which is the index from list
*/

oranges.foldLeft(0)((p, l) => p + 25 * 231 * l)

oranges.foldLeft(1)((acc, num) => acc * num)

/* below we are taking list oranges and taking the result of sum and
 assigning the sum of the equation to the val result */

oranges.foldLeft[Int](23)((x, y) => {
  val result : Int =  x * y
    result})

/* below is the short hand version of adding the accumlator + list index
together, you can change the + to * to multiply etc  */

oranges.foldLeft(0)(_+_)



