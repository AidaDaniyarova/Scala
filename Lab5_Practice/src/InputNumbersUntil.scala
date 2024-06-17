import scala.io.StdIn.readInt

object InputNumbersUntil {
  //Exercise #6: Inputting numbers into a list
  def main(args: Array[String]): Unit = {
    var xs: List[Int] = List()

    print("First number? ")
    var num = readInt()

    while (num >= 0) {
      xs = xs :+ num

      print("Another number? ")
      num = readInt()
    }

    println(xs.reverse)
  }
}