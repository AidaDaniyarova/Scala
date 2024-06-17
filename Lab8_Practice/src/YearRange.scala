
import scala.io.StdIn.*
object YearRange {
  //Exercise #5: Filtering years
  def main(args:Array[String]):Unit= {
    print("Enter your date of birth: ")
    var dateOfBirth = readInt()
    var now = 2024
    var yearList = for (i <- dateOfBirth to now) yield i
    var filterYear = yearList.filter(_%4!=0)
    for (i <- filterYear) {
      println(i)
    }
  }
}
