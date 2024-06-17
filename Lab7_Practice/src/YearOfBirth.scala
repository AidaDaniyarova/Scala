import scala.io.StdIn.*

object YearOfBirth {
  //Exercise #10: Yielding dates
  def main(args:Array[String]):Unit={
    print("Enter your date of birth: ")
    var dateOfBirth=readInt()
    var now = 2024
    var yearList = for(i <- dateOfBirth to now) yield i
    for(i <- yearList){
      println(i)
    }
  }

}
