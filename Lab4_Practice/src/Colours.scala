import scala.io.StdIn.*

object Colours {
  //Exercise #8: Colour matching
  def main(args: Array[String]): Unit = {

    var colour = readLine("Enter any number from 1-7: ")
    colour match {
      case "1" => println("Red")
      case "2" => println("Orange")
      case "3" => println("Yellow")
      case "4" => println("Green")
      case "5" => println("Blue")
      case "6" => println("Indigo")
      case "7" => println("Violet")
      case _ => println("Invalid number")
    }
  }
}