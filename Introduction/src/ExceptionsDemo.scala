
object ExceptionsDemo {
  def main(args: Array[String]): Unit = {
    var myArray = Array[String]("John","Emily", "Robert","Jones","Rose")
    var i=0
    try {
      while (i <= 5) {
        println(myArray(i))
        println(s"${5/0}")
        i += 1
      }
    }
    catch
      {
        case e: ArrayIndexOutOfBoundsException => println("Excepts the boundaries")
        case c: ArithmeticException => println("Cannot divide by 0");
        case hj:Exception => println("Error 404") // Should be last because it accepts all exceptions
      }
    finally
      {
        println("This block gets executed al the time")
      }
      println("Hello")
  }
}
