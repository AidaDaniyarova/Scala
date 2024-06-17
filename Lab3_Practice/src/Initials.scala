import scala.io.StdIn.*

object Initials {
  //Exercise #10: Solving a problem with a variety of string methods
  def main(args: Array[String]): Unit = {
    //a)Output initials
    var name:String = readLine("Enter your first name: ")
    var surname:String = readLine("Enter your lastname: ")
    var initials = name.charAt(0).toString+surname.charAt(0).toString
    println(initials)
    //b) Create email
    var email:String=name.charAt(0).toString.toLowerCase()+"."+surname.toLowerCase()+"@email.dmu.ac.uk"
    println(email)
  }
}
