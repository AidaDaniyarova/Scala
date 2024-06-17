import scala.io.StdIn.readInt

object InputXandY {
  //Exercise #2: Multiple  input
    def main(args: Array[String]): Unit = {
      print("Enter two numbers ")
      var x: Int = readInt()
      var y: Int = readInt()
      println("You entered " + x)
      println("You entered " + y)
      println("Your numbers sum is " + (x + y))
      println("Your numbers product is " + (x * y))
    }
}
