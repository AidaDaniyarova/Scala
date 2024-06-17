import scala.io.StdIn.readInt

object OddEven {
  //Exercise #2: Using if as an expression
  def main(args: Array[String]): Unit = {
    println("Type in a number ")
    var number: Int = readInt()

    var result = if (number % 2 == 0)
      "even"
    else
      "odd"

    var sign = if (number >= 0)
      "positive"
    else
      "negative"

    println("Your number is " + result)
    println("Your number is " + sign)
  }
}