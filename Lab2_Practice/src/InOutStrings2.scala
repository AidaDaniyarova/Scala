import scala.io.StdIn.*

object InOutStrings2 {
  //Exercise #5: Inputting different types
  def main(args: Array[String]): Unit = {
    print("Enter your first name ")
    var firstName: String = readLine()
    var lastName: String = readLine("Enter your last name ")
    println("Enter your initial ")
    var initial: Char = readChar()
    var houseNum: String = readLine("Enter your house number ")
    var address: String = readLine("Enter your address ")
    var phoneNum: String = readLine("Enter your phone number ")
    println("Enter your salary ")
    var salary: Int = readInt()
    var sex: String = readLine("Enter your sex (F/M)")
    if sex=="F" || sex=="f"
      then
      println("Your name is Miss " + firstName + " " + lastName)
    else
      println("Your name is Mr " + firstName + " " + lastName)
  }
}