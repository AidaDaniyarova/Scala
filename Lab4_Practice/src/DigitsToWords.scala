import scala.io.StdIn.*

object DigitsToWords {
  //Exercise #4: Conditional branching
  def main(args: Array[String]): Unit = {
    print("Enter digit number: ")
    var number = readInt()

    if (number>=0 && number<=9)
      if (number==0) println("ZERO")
      else if (number==1) println("ONE")
      else if (number == 2) println("TWO")
      else if (number == 3) println("THREE")
      else if (number == 4) println("FOUR")
      else if (number == 5) println("FIVE")
      else if (number == 6) println("SIX")
      else if (number == 7) println("SEVEN")
      else if (number == 8) println("EIGHT")
      else if (number == 9) println("NINE")
    else println("NOT A DIGIT")

  }
}
