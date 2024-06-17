val defName = "Name"
val defday = 0
val defmonth = 0
val defyear = 1900

class Birthday(var name:String, var day:Int, var month:Int, var year:Int) {
  
  def this() = {
    this(defName, defday, defmonth, defyear)
  }
  
  def print() ={
    println(s"Name:  $name, Day:  $day, Month: + $month, Year: + $year")
  }
}
