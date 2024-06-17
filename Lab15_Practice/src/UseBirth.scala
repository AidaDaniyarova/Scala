import scala.io.StdIn.*

object UseBirth {
  //Exercise #4: birthdays
  def main(args:Array[String]): Unit = {
    val birthday1 = new Birthday("Anna", 2, 12, 2005)
    val birthday2 = new Birthday("Jacob", 15, 2, 1999)
    val birthday3 = new Birthday("Caroline", 22, 6, 2001)
    val birthday4 = new Birthday("Brendon", 18, 3, 1998)
    val birthday5 = new Birthday("Jennie", 19, 10, 2000)

    var names:List[String] = List(birthday1.name, birthday2.name, birthday3.name, birthday4.name, birthday5.name)
    var days:List[Int] = List(birthday1.day, birthday2.day, birthday3.day, birthday4.day, birthday5.day)
    var choose = readLine("Name | Day\n")
    if(choose == "Name" || choose == "name"){
      var name = readLine("Enter name to search: ")
      var filteredNameList = names.filter(_ == name)
      filteredNameList.foreach(print)
      print(" exists")
    }
    else if(choose == "Day" || choose == "day"){
      print("Enter day to search: ")
      var day = readInt()
      var filteredDayList = days.filter(_ == day)
      filteredDayList.foreach(print)
      print(" exists")
    }
    else println("Wrong word")
  }

}
