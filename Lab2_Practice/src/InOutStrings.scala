import scala.io.StdIn._

object InOutStrings {
  //Exercise #3: Input with prompts
  def main(args: Array[String]): Unit = {
    print("Enter your first name ")
    var firstName: String = readLine()
    var lastName: String = readLine("Enter your last name ")
    var sex: String = readLine("Enter your sex (F/M) ")
    if (sex=="F" || sex=="f")
    println("Your name is Miss " + firstName + " " + lastName)
    else
      println("Your name is Mr " + firstName + " " + lastName)
  }
}