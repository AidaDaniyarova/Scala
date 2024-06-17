import scala.io.StdIn.*

object SumToN {
  //Exercise #12: Using parentheses
  def main(args:Array[String]): Unit= {
    print("Enter the number: ")
    var N:Int = readInt()
    var sum:Int = N * (N + 1) / 2
    print("The sum from 1 to "+N+" is "+sum)
  }
}
