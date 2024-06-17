import scala.io.StdIn.*

object InputTenNumbersIntoList {
  //Exercise #2: Inputting lots of numbers into a list
  def main(args:Array[String]): Unit= {
    var numbers:List[Int] = List()
    print("Enter 10 numbers: ")
    var i = 10
    while i>0
    do {numbers=numbers:+readInt; i-=1}
    numbers=numbers.reverse
    numbers.foreach(println)
  }
}