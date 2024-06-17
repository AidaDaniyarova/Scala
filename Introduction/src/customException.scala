import scala.io.StdIn.*
object customException {
  def main(args: Array[String]):Unit={
    println("-----------Voting System-----------")
    print("Enter your age: ")
    var age = readInt()
    try {
      if (age < 18) {
        throw new InvalidAgeException("IllegalAgeForVoting")
      }
      else println("You are eligible to vote")
    }
    catch
      {
        case e: InvalidAgeException => {
          var descriptionOfExp = e.getMessage
          println(descriptionOfExp)
          e.giveMoreDetails()
          println("You are under 18, not eligible to vote")
        }
      }
    println("Rest of the program")
}
}

class InvalidAgeException(s:String) extends Exception(s)
{
  def giveMoreDetails():Unit={
    println("Details of the exception")
  }
}
